package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly b=new RWOnly();
        // name has private access in com.driver.RWOnly
        b.setName("naveen");
        System.out.print(b.getName());
    }
}