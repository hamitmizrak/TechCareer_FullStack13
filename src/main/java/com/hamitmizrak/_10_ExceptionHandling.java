package com.hamitmizrak;
import java.io.IOException;
public class _10_ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException, IOException {

        // Exception Handling
        System.out.println("1.alan çalıştı");
        System.out.println(0/4);
        try{
            System.out.println(4/0);
        }catch (ArithmeticException ari){
            System.out.println(ari);
            ari.printStackTrace();
        }catch (Exception exp){
            System.out.println(exp);
            exp.printStackTrace();
        }finally {
            System.out.println("2.alan çalıştı");
        }

        // Bilerek istisna fırlatmak için kullanıyoruz.
        //throw new ArithmeticException("sıfıra neden böldün");

        //System.out.println("son alan çalıştı");
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.hamitmizrak._10_ExceptionHandling.main(_10_ExceptionHandling.java:11)
        */

        // Array
        // Collection
        // OOP
        // Inheritance
        // Abstract
        // interface
    }
}
// 1000ms =1sn