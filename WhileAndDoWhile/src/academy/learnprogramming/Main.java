package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (int i = 6; i!=6 ; i++){
//            System.out.println("Count value is " + count);
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//            if (count>100){
//                break;
//            }
//        }while (count !=6);

//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        int number = 4;
        int finishNum = 20;
        int count = 0;
        int sum = 0;

        while (number <= finishNum) {
            number++;

            if (!isEvenNumber(number)) {
                continue;
            }

            count++;
            sum += number;
            System.out.println("Even number " + number);

            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);
    }

    public static boolean isEvenNumber(int num) {

        while (num % 2 == 0) {
            return true;
        }

        return false;
    }
}
