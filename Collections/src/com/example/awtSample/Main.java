package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theater theater = new Theater("CGV", 8, 12);
        theater.getSeat();

        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
