package com.vcredit.refactoring.demo1;

/**
 * 新片租赁
 *
 * @author zhoude
 * @date 2019/2/25 17:24
 */
public class NewReleasePrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }

        return 1;
    }
}
