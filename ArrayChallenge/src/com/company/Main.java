package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] myInteger = getInteger(5);
        int[] sortInteger = sortInteger(myInteger);
        printArray(sortInteger);

    }

    public static int[] getInteger(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter" + capacity + "integer value:\r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortInteger(int[] array) {
//        int[] sortArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            sortArray[i] = array[i];
//        }

        int[] sortArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] < sortArray[i + 1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i + 1];
                    sortArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortArray;
    }
}
