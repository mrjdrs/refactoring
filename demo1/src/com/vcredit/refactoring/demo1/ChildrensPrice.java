package com.vcredit.refactoring.demo1;

/**
 * 儿童租赁
 *
 * @author zhoude
 * @date 2019/2/25 17:23
 */
public class ChildrensPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.CHILD_RENT;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }

        return result;
    }
}
