package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() +
                "'s engine is starting");
        return "Engine started";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() +
                " is accelerating");
        return "Accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() +
                " is braking");
        return "Braking";
    }}
