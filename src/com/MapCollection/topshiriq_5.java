package com.MapCollection;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class topshiriq_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kalitni kiriting :");
        Integer key = scanner.nextInt();

        TreeMap<Integer, String> techBrands = new TreeMap<>();

        techBrands.put(2, "Samsung");
        techBrands.put(1, "Apple");
        techBrands.put(3, "Microsoft");
        techBrands.put(5, "Intel");
        techBrands.put(6, "Oracle");
        techBrands.put(4, "Amazon");
        techBrands.put(7, "Sony");

//        a)

        System.out.println(techBrands.headMap(key));

//        b)

        Set<Integer> set = techBrands.keySet();

        TreeSet<Integer> treeSet = new TreeSet<>(set);

        treeSet.forEach(num -> {
            System.out.println(num);
        });

//        c)

        techBrands.clear();

    }
}
