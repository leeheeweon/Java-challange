package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
        sumFirstAndLastDigit(10);
        sumFirstAndLastDigit(11);
    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int revers = 0;
        int firstDigit = 0;
        int lastDigit = 0;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            firstDigit = number % 10;
            lastDigit = number % 10;
            revers = (revers * 10) + lastDigit;
            number /= 10;
        }

        if (revers == 1) {
            revers = 0;
            lastDigit = 0;
        }

        while (revers > 0) {
            lastDigit = revers % 10;
            revers /= 10;
        }

        sum = lastDigit + firstDigit;
        return sum;
    }
}
