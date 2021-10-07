package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 1;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int num = scanner.nextInt();
                sum += num;
                avg = Math.round((double) sum / count);
                count++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
