package com.scm;

public class StudentDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return 0.3*price;
    }
}
