package com.MapCollection;

import java.util.HashMap;

public class topshiriq_2 {
    public static void main(String[] args) {

        HashMap<Integer, String> techBrands = new HashMap<>();
        techBrands.put(1, "Apple");
        techBrands.put(2, "Samsung");
        techBrands.put(3, "Microsoft");
        techBrands.put(4, "Amazon");
        techBrands.put(5, "Intel");
        techBrands.put(6, "Oracle");
        techBrands.put(7, "Sony");

        HashMap<Integer, String> techBrands2 = new HashMap<>();
        techBrands2.put(8, "Alibaba");
        techBrands2.put(9, "Panasonic");
        techBrands2.put(10, "Nvidia");
        techBrands2.put(11, "Tesla");

//        a)

        techBrands.putAll(techBrands2);

        System.out.println(techBrands);

//        b)

        System.out.println(techBrands.values());

//        c)

        techBrands.clear();
        techBrands2.clear();

    }
}
