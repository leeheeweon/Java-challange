package academy.learnprogramming;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();
        int age = 2021 -yearOfBirth;
        scanner.nextLine(); // handle next line character (enter key)1
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }

}
