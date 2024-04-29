package com.hamitmizrak;

public class _7_Conditional {

    // Conditional
    // 1.Method
    public static void resultData(){
        int number1=-44;
        if(number1>0){
            System.out.println("Pozitif Sayı");
        }else
            System.out.println("Negatif Sayı");
    }

    // 2.Method
    public static void resultTernary(){
        int number1=-44;
        String result= (number1>0) ? "Pozitif Sayı" : "Negatif Sayı";
        System.out.println(result);
    }

    // 3.Method
    public static void resultData2(){
        int number1=3;
        if(number1==1){
            System.out.println("sayı 1");
        }else if(number1==2) {
            System.out.println("sayı 2");
        }else if(number1==3) {
            System.out.println("sayı 3");
        }else if(number1==4) {
            System.out.println("sayı 4");
        }else{
            System.out.println("Sayı 1<=Sayi<=4 dışındadır.");
        }
    }

    // 4.Method
    public static void resultSwitchCase(){
        int number1=3;
        switch (number1){
            case 1:
                System.out.println("sayı 1");
                break;
            case 2:
                System.out.println("sayı 2");
                break;
            case 3:
                System.out.println("sayı 3");
                break;
            case 4:
                System.out.println("sayı 4");
                break;

            default:
                System.out.println("Sayı 1<=Sayi<=4 dışındadır.");
                break;
        }
    }

    public static void main(String[] args) {
        // Conditional
        resultData();
        resultTernary();

        resultData2();
        resultSwitchCase();
    }

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
