package com.company;

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + "is accelerating";
    }

    public String brake() {
        return "starting the " + getClass().getSimpleName() + " is braking";
    }

}

