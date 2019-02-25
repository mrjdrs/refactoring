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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = rentalVectors.elements();
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(each.getCharge()).append("\n");
            totalAmount += each.getCharge();
        }

        // add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n")
                .append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return result.toString();
    }

//  --------------- getter and setter ---------------

    public String getName() {
        return name;
    }
}
