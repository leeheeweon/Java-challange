package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {
        int oneLastDigit = one % 10;
        int twoLastDigit = two % 10;
        int threeLastDigit = three % 10;

        if ((one < 10) || (one > 1000) || (two < 10) || (two > 1000) || (three < 10) || (three > 1000)) {
            return false;
        } else if ((oneLastDigit == twoLastDigit) || (twoLastDigit == threeLastDigit) || (threeLastDigit == oneLastDigit)) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num) {
        if ((num < 10) || (num > 1000)) {
            return false;
        }

        return true;
    }
}
