package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(array));

        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    private static void reverse(int[] array){
        int maxLength = array.length-1;
        int halfLength = array.length /2;

        for (int i = 0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength -i] = temp;
        }
    }
}
