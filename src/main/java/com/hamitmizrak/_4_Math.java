package com.hamitmizrak;

import java.util.Random;

public class _4_Math {

    public static void main(String[] args) {
        // Math
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.min(3,4));
        System.out.println(Math.max(3,4));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.abs(-55));
        System.out.println(Math.sin(1));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));

        // Rastgele
        System.out.println(Math.random()*4+1);
        System.out.println( Math.ceil(Math.random()*4+1) );

        Random random= new Random();
        int number3=random.nextInt(4)+1;
        System.out.println(number3);

        // String

        // Method
        // Conditional
        // Date
        // Loop
        // Exception Handling
        // Array
        // Collection
        // OOP
        // Inheritance
        // Abstract
        // interface
    }
}
