package com.company;

public class Eagle extends Bird{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
