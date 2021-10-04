package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

//        reverse(-121);
//        reverse(1212);
//        reverse(1234);
//        reverse(100);

//        getDigitCount(0);
//        getDigitCount(123);
//        getDigitCount(-1);
//        getDigitCount(5200);
    }

    public static void numberToWords(int number) {
        int lastDigit = 0;
        int numDigit = getDigitCount(number);
        number = reverse(number);


        if (number < 0) {
            System.out.println("Invalid Value");
        }

        while (numDigit > 0) {
            lastDigit = number % 10;
            numDigit -= 1;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
            number /= 10;
        }

    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit = 0;
        while (number > 0 || number < 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number == 0) {
            count = 1;
        } else if (number < 0) {
            return -1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
