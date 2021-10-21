package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        readInteger();
    }

    private static void readInteger() {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        int[] array = readElements(count);
        int min = findMin(array);
        System.out.println(min);
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + count + " number");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (array[i] < min) {
                min = value;
            }
        }
        return min;
    }
}
