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
