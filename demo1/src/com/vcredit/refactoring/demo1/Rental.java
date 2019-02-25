package com.vcredit.refactoring.demo1;

/**
 * 租赁类
 *
 * @author zhoude
 * @date 2019/2/25 11:28
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge() {
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2) {
                    result += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILD_RENT:
                result += 1.5;
                if (getDaysRented() > 3) {
                    result += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints() {
        // 租赁新片且租赁天数超过1天，积分+2
        boolean flag = (getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1;
        if (flag) {
            return 2;
        }

        // 其他情况积分+1
        return 1;
    }

//  --------------- getter and setter ---------------

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }
}
