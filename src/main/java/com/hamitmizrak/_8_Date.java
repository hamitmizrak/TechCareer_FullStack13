package com.hamitmizrak;

import java.util.Date;

public class _8_Date {

    public static void main(String[] args) {

        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getHours()+":"+date.getMinutes());
        date.setHours(17);
        System.out.println(date.getHours()+":"+date.getMinutes());
        System.out.println(date.getHours()+":"+date.getMinutes()+" "+date.getYear());

        // Stack Memory Heap Memory Araştırma
        // Date 2024 iken bana 124 sayısını veriyor  1900 ?

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
