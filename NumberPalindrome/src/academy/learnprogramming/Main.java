package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPalindrome(-101));
    }

    public static boolean isPalindrome(int number) {
        int revers = 0;
        int newNumber = number;

        while (newNumber > 0 || newNumber < 0) {
            int digit = number % 10;
            revers *= 10;
            revers += digit;
            System.out.println(revers);
            //drop the least-significant digit
            number /= 10;
        }

        if (newNumber == revers) {
            return true;
        }

        return false;
    }
}
