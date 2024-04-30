package com.hamitmizrak;

public class _9_Loop {

    public static void forLoop(){
        for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
        }
        // for sonsuz döngüsü
        // for(;;){}
    }

    public static void whileLoop(){
        int i = 1;
        while (i <=10) {
            System.out.print(i+" ");
            //i++;
            //i=i+1;
            i+=1;
        }
        // while sonsuz döngüsü
        // while(true){}
    }

// doWhile:
    public static void doWhileLoop(){
        // Global Variable
        // Local Variable
        int i = 1;
        do{
            System.out.print(i+" ");
            //i++;
            //i=i+1;
            i+=1;
        } while (i <=-10);
    }

    public static void main(String[] args) {
        // Loop
        //forLoop();
        System.out.println("");
        //whileLoop();
        System.out.println("");
        doWhileLoop();

        // Exception Handling
        // Array
        // Collection
        // OOP
        // Inheritance
        // Abstract
        // interface
    }
}
