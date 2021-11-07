package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone heesPhone;
        heesPhone = new DeskPhone(93954690);
        heesPhone.powerOn();
        heesPhone.callPhone(93954690);
        heesPhone.answer();

        heesPhone = new MobilePhone(93954691);
        heesPhone.powerOn();
        heesPhone.callPhone(93954691);
        heesPhone.answer();

    }
}
