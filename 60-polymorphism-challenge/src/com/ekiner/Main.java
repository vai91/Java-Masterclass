package com.ekiner;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        //tufek mikrop celik kitabi.
        return "(Generic)Engine started.";
    }
    public String accelerate (){
        return "(Generic)Accelerating.";
    }

    public String brake (){
        return "(Generic)Braking.";
    }
}

class Renault extends Car {
    public Renault(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine started.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brakes.";

    }

}

class FauVee extends Car{
    public FauVee(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine started.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brakes.";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " Engine started.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brakes.";
    }

}

public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generice car calss.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).

        Car car = new Car(4,"Generic car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Renault renault = new Renault(4,"MeganeII 1.6 16V Privilege Saloon");
        System.out.println(renault.startEngine());
        System.out.println(renault.accelerate());
        System.out.println(renault.brake());

        FauVee fauVee = new FauVee(4,"Jetta 1.6 TDI Highline Bluemotion DSG");
        System.out.println(fauVee.startEngine());
        System.out.println(fauVee.accelerate());
        System.out.println(fauVee.brake());

        Ford ford = new Ford(4,"Focus 1.5 Ecoboost");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }


}
