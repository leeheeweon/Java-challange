package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
            counter++;

            if (counter == 10) {
                break;
            }
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}
