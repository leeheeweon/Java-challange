package com.example.awtSample;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Theater theater = new Theater("CGV", 8, 12);
//        theater.getSeat();

        if (theater.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }

    public static void printList(List<Theater.Seat> list) {
        for (Theater.seat :list){
            System.out.println(" " + seat.getSeatNumber());
        }

    }
}
