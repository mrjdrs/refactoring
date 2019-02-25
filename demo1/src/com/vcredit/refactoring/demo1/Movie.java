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
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public double getCharge(int daysRented) {
        double result = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += daysRented * 3;
                break;
            case Movie.CHILD_RENT:
                result += 1.5;
                if (daysRented > 3) {
                    result += (daysRented - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        // 租赁新片且租赁天数超过1天，积分+2
        boolean flag = (getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1;
        if (flag) {
            return 2;
        }

        // 其他情况积分+1
        return 1;
    }

//  --------------- getter and setter ---------------

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
