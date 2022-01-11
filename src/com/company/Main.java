package com.company;

import com.company.products.Vegemite;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int input = 10;
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        Set<Integer> integerSet = new HashSet<>();
        List<Map<String, String>> map = new ArrayList<>();
        List<Map<String, String>> map1 = new ArrayList<>();

        Vegemite Vs1 = new Vegemite();
        System.out.println("Number of Item and Code : "+input+" "+Vs1.getvCode());
        System.out.println("Product Name : "+Vs1.getvName());
        System.out.println("Product Code : "+Vs1.getvCode());
        Vs1.getvPrice().forEach((k,v)-> {
            integerSet.add(Integer.valueOf(k));

            System.out.println("Package : "+k+" Amount will be : $"+v);
        });

        int temp = 0;
        int remain=0;
        List<Integer> integerList = new ArrayList<>();
        for (Integer i : integerSet) {
            Map<String, String> integerMap = new HashMap<>();
            Map<String, String> integerMapRemain = new HashMap<>();
            temp = input/i;
            remain = input%i;
            integerMap.put(String.valueOf(i), String.valueOf(temp));
            integerMapRemain.put(String.valueOf(i), String.valueOf(remain));
            map.add(integerMap);
            map1.add(integerMapRemain);
            integerList.add(temp);
        }

        int minV = integerList.get(0);
        String packageValue = null;
        String remaining = null;
        String dividedValue = null;
        for (Integer i: integerSet) {
            if (input/i==0) {
                packageValue =String.valueOf(i);
                dividedValue =String.valueOf(input/i);
                remaining ="0";
            } else {
                for (Map<String, String> j : map) {
                    for (Map<String, String> remainV : map1) {
                        if (remainV.get(String.valueOf(i))!=null) {
                            int t = Integer.valueOf(remainV.get(String.valueOf(i)))/i;
                            if (t==0) {
                                packageValue =String.valueOf(i);
                                dividedValue =j.get(String.valueOf(i));
                                remaining = remainV.get(String.valueOf(i));
                            }
                        }

                    }
                }
            }

        }
        Double total = null;
        if (Vs1.getvPrice().get(packageValue)!=null && dividedValue!=null) {
            total = ((Double)Vs1.getvPrice().get(packageValue) * Double.valueOf(dividedValue));
            if (Vs1.getvPrice().get(remaining)!=null) {
                total = total+ Double.valueOf(Vs1.getvPrice().get(remaining));
            }
        }
        System.out.println("Total : $"+ total);
        System.out.println("Package Value :"+packageValue);
        System.out.println("Divided Value :"+dividedValue);
        System.out.println("Remaining :"+remaining);
    }
}
