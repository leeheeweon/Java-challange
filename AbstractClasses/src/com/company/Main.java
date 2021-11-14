package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("pico");
        dog.eat();
        dog.breathe();

        Eagle eagle = new Eagle("Australian ringneck");
        eagle.eat();
        eagle.breathe();
        eagle.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();


        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {

        }
    }
}
