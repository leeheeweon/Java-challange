package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;

        int stock = bigCount + smallCount;

        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            if (goal <= stock) {
                if (goal % 5 == 0 && bigCount % 5 == 0)
                    return true;

                if (bigCount % 5 == 0 && goal % 5 <= smallCount)
                    return true;

                if (goal <= smallCount)
                    return true;
            }
        }
        return false;
    }
}
