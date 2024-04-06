package com.MapCollection;

import java.util.Map;
import java.util.TreeMap;

public class topshiriq_4 {
    public static void main(String[] args) {

//        a)

        TreeMap<Integer, String> techBrands = new TreeMap<>();

        techBrands.put(2, "Samsung");
        techBrands.put(1, "Apple");
        techBrands.put(3, "Microsoft");
        techBrands.put(5, "Intel");
        techBrands.put(6, "Oracle");
        techBrands.put(4, "Amazon");
        techBrands.put(7, "Sony");

//        b)

        System.out.println(techBrands.firstEntry());
        System.out.println(techBrands.lastEntry());

//        c)

        System.out.println(techBrands.descendingKeySet());

        for (Integer key : techBrands.descendingKeySet()){         // ikkinchi yo'li
            System.out.println(key);
        }

    }
}
