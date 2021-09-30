package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        int evenDigit = 0;
        if (number < 0) {
            return -1;
        }

        while (number > 0){
            if ((number%10)%2==0){
                evenDigit = number%10;
                System.out.println(evenDigit);
                sum+=evenDigit;
            }
            number/=10;
        }
        return sum;
    }
}
