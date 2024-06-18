package com.scm;

public class SeniorcitizonDiscountStrategy implements DiscountStrategy{
    @Override
    public double calculateDiscount(double price) {
        return 0.5*price;
    }
}
