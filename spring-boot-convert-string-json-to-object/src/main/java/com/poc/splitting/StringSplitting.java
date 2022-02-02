package com.poc.splitting;

import java.util.Arrays;

public class StringSplitting {
    public void splittingExample() {
        String ourString = "apples, oranges, pears, pineapples";
        String[] fruits = ourString.split(",");

        System.out.println(Arrays.toString(fruits));

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = fruits[i].trim();
        }

        System.out.println(Arrays.toString(fruits));
    }
}
