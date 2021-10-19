package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        int[] myInteger = getIntegers(5);
        int[] sortInteger = sortIntegers(myInteger);
        printArray(sortInteger);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter" + capacity + "integer value: \r");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " Contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortArray.length - 1; i++) {
                if (sortArray[i] < sortArray[i + 1]) {
                    temp = sortArray[i];
                    sortArray[i] = sortArray[i+1];
                    sortArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortArray;
    }
}
