package com.vcredit.refactoring.demo1;

/**
 * 影片类
 *
 * @author zhoude
 * @date 2019/2/25 11:24
 */
public class Movie {

    /**
     * 定期租赁
     */
    public static final int REGULAR = 0;

    /**
     * 新发布产品租赁
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 儿童租赁
     */
    public static final int CHILD_RENT = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

//  --------------- getter and setter ---------------

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILD_RENT:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("not found priceCode");
        }
    }
}
