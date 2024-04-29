package com.hamitmizrak;

import java.util.Scanner;

public class _6_Method {

    // 1-) voidli Parametresiz
    public static void voidliParametresiz(){
        System.out.println("voidli Parametresiz");
    }

    // 2-) voidli Parametreli
    public static void voidliParametreli(int x, int y){
        System.out.println("voidli Parametreli "+(x+y));
    }

    // 3-) voidsiz Parametresiz
    public static int  voidsizParametresiz(){
        System.out.println("Lütfen bir sayı giriniz");
        Scanner klavye=new Scanner(System.in);
        String sNumber=klavye.nextLine();
        int result=Integer.valueOf(sNumber);
        return  result;
    }

    // 4-) voisiz Parametreli
    public static double  voidsizParametreli(int x){
        return  Math.pow(x,2);
    }

    public static void main(String[] args) {
        // Method
        voidliParametresiz();
        voidliParametreli(4,5);

        //int result=  voidsizParametresiz();
        //System.out.println("Sonuç: "+result);

        double result2=  voidsizParametreli(9);
        System.out.println(result2);
    }
}
