package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Discount discount = new Discount();
        discount.setPrice(10);
        discount.setDiscountStrategy(new SeniorcitizonDiscountStrategy());

        double ans = discount.getPriceAfterDiscount();
        System.out.println(ans);

    }
}