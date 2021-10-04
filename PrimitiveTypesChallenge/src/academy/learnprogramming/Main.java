package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 5;
        short shortValue = 10;
        int intValue = 15;
        long longValue = 50000 + 10 * (byteValue+shortValue+intValue);
        System.out.println(longValue);

        short shortTotal = (short) (1000 + 10 * (byteValue+shortValue+intValue));
    }
}
