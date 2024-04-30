package com.hamitmizrak;

import java.util.*;

public class _12_Collection {

    // List: LinkedList,ArrayList, Vector
    // Set : HashSet,LinkedHashSet,TreeSet
    // Map : HashMap,LinkedHashMap,TreeMap

    // List: LinkedList,ArrayList, Vector
    // LIST
    public static void listData(){
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

        System.out.println("");
        // forEach Döngü
        for (Integer temp :listem) {
            System.out.print(temp+" ");
        }

        System.out.println("");
        // Iterator
        Iterator iterator=listem.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println("");
        // Java 8 Stream().api
        listem.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });

        System.out.println("");
        // Java 8 Stream().api
        listem.forEach(System.out::println);


        // Set HashSet, LinkedHashSet, TreeSet
        // Map HashMap, LinkedHashMap, TreeMap
    }


    // Set : HashSet,LinkedHashSet,TreeSet
    // SET
    public static void setData(){
        // List ArrayList:Ekleme ve Arama,
        //Set<Integer> listem=new HashSet<>();
        //Set<Integer> listem=new LinkedHashSet<>();
        Set<Integer> listem=new TreeSet<>();
        // ArrayList<Integer> listem=new ArrayList<>();
        // List<Integer> listem=new LinkedList<>();
        listem.add(1);
        listem.add(1);
        listem.add(4);
        listem.add(4);
        listem.add(3);
        listem.add(9);
        listem.add(8);

        /*
        System.out.println(listem.size());
        System.out.println("Hashcode: "+listem.hashCode());
        System.out.println("var mı: "+listem.contains(9));
        System.out.println("Boş mu: "+listem.isEmpty());
        */
        //System.out.println(listem.remove(0));


        System.out.println("");
        // forEach Döngü
        for (Integer temp :listem) {
            System.out.print(temp+" ");
        }

        //System.out.println("");
        // Iterator
//        Iterator iterator=listem.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }

        /*System.out.println("");
        // Java 8 Stream().api
        listem.stream().forEach((temp)->{
            System.out.print(temp+" ");
        });*/

        //System.out.println("");
        // Java 8 Stream().api
        //listem.forEach(System.out::println);


        // Set HashSet, LinkedHashSet, TreeSet
        // Map HashMap, LinkedHashMap, TreeMap
    }

    // Map : HashMap,LinkedHashMap,TreeMap
    public static void mapData(){
        Map<String,String> mapList=new HashMap<>();
        mapList.put("a1","Malatya");
        mapList.put("a2","Elazığ");
        mapList.put("a3","Bingöl");
        mapList.put("a4","Tunceli");

        // Key
        for(String key:mapList.keySet()){
            System.out.println(key);
        }

        // Value
        for(String value:mapList.values()){
            System.out.println(value);
        }

        // Key-Value
        for(String key:mapList.keySet()){
            System.out.println(  key +" => "+mapList.get(key));
        }

        mapList.entrySet().forEach(System.out::println);
    }

    public static void main(String[] args)  {
        // Collection
        //listData();
        //setData();
        mapData();
    }
}
