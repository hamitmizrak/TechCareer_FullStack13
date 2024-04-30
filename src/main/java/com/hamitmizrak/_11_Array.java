package com.hamitmizrak;
import java.io.IOException;
import java.util.Arrays;

public class _11_Array {

    public static void arrayData(){
        int[] dizi=new int[9];
        dizi[0]=8;
        dizi[1]=2;
        dizi[2]=3;
        dizi[3]=1;
        dizi[8]=9;
        System.out.println("length: "+dizi.length);
        System.out.println(dizi[0]);

        System.out.println("");

        // Iterative For
        for (int i = 0; i <dizi.length ; i++) {
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");

        // for Each
        /*
        for(int temp : dizi ){
            System.out.print(temp+" ");
        }
        */

        System.out.println("\nHash Code: "+dizi.hashCode());

        int[] cloneData=   dizi.clone();
        Arrays.sort(cloneData);
        for(int temp : cloneData ){
            System.out.print(temp+" ");
        }
    }

    public static void main(String[] args)  {

        // Array
        arrayData();
        // Collection
        // OOP
        // Inheritance
        // Abstract
        // interface
    }
}
// 1000ms =1sn