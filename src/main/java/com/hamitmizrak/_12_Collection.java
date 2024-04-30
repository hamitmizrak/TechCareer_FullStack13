package com.hamitmizrak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _12_Collection {

    public static void collectionData(){
        // List ArrayList:Ekleme ve Arama,
        List<Integer> listem=new LinkedList<>();
        // ArrayList<Integer> listem=new ArrayList<>();
        // List<Integer> listem=new LinkedList<>();
        listem.add(4);
        listem.add(4);
        listem.add(1);
        listem.add(3);
        listem.add(8);
        listem.add(9);

        System.out.println(listem.size());
        System.out.println("Hashcode: "+listem.hashCode());
        System.out.println("var mı: "+listem.contains(9));
        System.out.println("Boş mu: "+listem.isEmpty());
        //System.out.println(listem.remove(0));

        // Iterative Döngü
        for (int i = 0; i <listem.size() ; i++) {
            System.out.print(listem.get(i)+" ");
        }
        
        // Set HashSet, LinkedHashSet, TreeSet
        // Map HashMap, LinkedHashMap, TreeMap
    }

    public static void main(String[] args)  {
        // Collection
        collectionData();
    }
}
