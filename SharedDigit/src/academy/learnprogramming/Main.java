package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        hasSharedDigit(12, 23);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int one, int two) {
        int lastDigit = 0;
        int digit = 0;
        int revers = 0;

        if (((one <= 10) || (one >= 99)) || ((two <= 10) || (two >= 99))) {
            System.out.println("false");
            return false;
        }

        while (one > 0) {
            digit = one % 10;
            revers = revers * 10 + digit;
            one /= 10;
        }

        while (revers > 0) {
            lastDigit = revers % 10;
            revers /= 10;
        }

        while (two > 0) {
            digit = two % 10;
            two /= 10;
        }

        if (lastDigit == digit) {
            return true;
        }

        return false;
    }
}
