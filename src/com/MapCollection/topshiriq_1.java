package com.MapCollection;

import java.util.HashMap;
import java.util.Map;

public class topshiriq_1 {
    public static void main(String[] args) {

//        a)

        HashMap<Integer, String> techBrands = new HashMap<>();
        techBrands.put(1, "Apple");
        techBrands.put(2, "Samsung");
        techBrands.put(3, "Microsoft");
        techBrands.put(4, "Amazon");
        techBrands.put(5, "Intel");
        techBrands.put(6, "Oracle");
        techBrands.put(7, "Sony");

//        b)

        for (Map.Entry<Integer, String> entry : techBrands.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

//        c)

        System.out.println(techBrands.size());
    }
}
