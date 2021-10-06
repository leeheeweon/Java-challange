package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean check = scanner.hasNextInt();

            if (check) {
                int number = scanner.nextInt();

//                if (first){
//                    first=false;
//                    min=number;
//                    max=number;
//                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        scanner.close();
    }
}
