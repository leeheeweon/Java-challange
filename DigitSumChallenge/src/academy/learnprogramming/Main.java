package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(321123));
    }

    public static int sumDigits(int number) {

        if ((number < 10) || (number < 0)) {
            System.out.println("Invalid value");
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 125 = 5
        while (number>0){
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;
        }

        return sum;
    }
}
