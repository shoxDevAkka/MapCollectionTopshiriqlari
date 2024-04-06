package com.MapCollection;

import java.util.*;

public class topshiriq_3 {
    public static void main(String[] args) {

        HashMap<Integer, String> techBrands = new HashMap<>();
        techBrands.put(1, "Apple");
        techBrands.put(2, "Samsung");
        techBrands.put(3, "Microsoft");
        techBrands.put(4, "Amazon");
        techBrands.put(5, "Intel");
        techBrands.put(6, "Oracle");
        techBrands.put(7, "Sony");

//        a)

        Object hashMap = techBrands.clone();
        System.out.println(hashMap);

//        b)

        HashMap<Integer, String> map = (HashMap<Integer, String>) hashMap;

        Collection<String> collection = map.values();

        ArrayList<String> list = new ArrayList<>(collection);

        System.out.println(list);



    }
}
