package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(45));
    }


    public static int getLargestPrime(int number) {
        int i;
        int copyOfInput = number;
        if (number <= 1) {
            return -1;
        }
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                i--;
            }
        }

        return i;
    }
}

