package com.hamitmizrak;

import java.util.Scanner;

public class _3_OperatorsAndScanner {

    public static void main(String[] args) {
        /*
        + - / * %
         */
        // Operator
        int numberData1=7;
        int numberData2=2;
        System.out.println("Toplam: "+(numberData1+numberData2));
        System.out.println("Çıkarma: "+(numberData1-numberData2));
        System.out.println("Çarpma: "+(numberData1*numberData2));
        System.out.println("Bölüm: "+(numberData1/numberData2));
        System.out.println("Kalan: "+(numberData1%numberData2));

        // Scanner
        Scanner klavye=new Scanner(System.in);
        System.out.println("\nLütfen İsminizi Giriniz");
        String name=klavye.nextLine();
        System.out.println("Adınız: "+name);
    }
}
