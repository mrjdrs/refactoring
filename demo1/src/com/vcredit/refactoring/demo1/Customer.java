package com.vcredit.refactoring.demo1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 客户类
 *
 * @author zhoude
 * @date 2019/2/25 11:32
 */
public class Customer {

    private String name;
    private Vector<Rental> rentalVectors = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentalVectors.add(rental);
    }

    public String statement() {
        Enumeration<Rental> rentals = rentalVectors.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(each.getCharge()).append("\n");
        }

        // add footer lines
        result.append("Amount owed is ").append(getTotalCharge()).append("\n")
                .append("You earned ").append(getTotalFrequentRenterPoints()).append(" frequent renter points");

        return result.toString();
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentals = rentalVectors.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration<Rental> rentals = rentalVectors.elements();
        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

//  --------------- getter and setter ---------------

    public String getName() {
        return name;
    }
}
