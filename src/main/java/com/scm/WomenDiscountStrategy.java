package com.scm;

public class WomenDiscountStrategy implements DiscountStrategy{

    @Override
    public double calculateDiscount(double price) {
        return 1.00*price;
    }
}
