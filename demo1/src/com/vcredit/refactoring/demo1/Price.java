package com.vcredit.refactoring.demo1;

/**
 * 租赁类型类
 *
 * @author zhoude
 * @date 2019/2/25 17:21
 */
public abstract class Price {

    public abstract int getPriceCode();

    public abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
