package org.example.arge;

public class CarSkeleton {
    protected String name;
    protected String description;

    public CarSkeleton() {
    }
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Starting engine...");
    }

    protected void runEngine() {
        System.out.println("Engine running...");
    }

    public void drive() {
        System.out.println("Driving...");
        runEngine();
    }


}
