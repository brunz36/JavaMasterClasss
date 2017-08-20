package com.brunoLearn;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);

//        printArray(myArray);

        sortIntegers(myArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("The element at index " + i + " is " + array[i]);
        }
    }

    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
        Collections.reverse(Arrays.asList(array));
        System.out.println("An assorted array");
        printArray(array);
    }
}
