package com.vcredit.refactoring.demo1;

/**
 * 定期租赁
 *
 * @author zhoude
 * @date 2019/2/25 17:25
 */
public class RegularPrice extends Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }

        return result;
    }
}
