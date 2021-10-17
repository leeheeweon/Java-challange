package com.company;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("DeluxeBurger", "Sausage & beef", 9.10, "White");
        super.addHamburgerAddition1("Chips" ,5 );
        super.addHamburgerAddition2("Drink" ,5);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional item to a deluxe burger");
    }
}
