package org.example;

import org.junit.*;

public class Car extends Vehicle {


    @Override
    public String accelerate(long mph) {
        return "The car accelerates at : " + mph + " MPH.";
    }
}

class Vehicle {
    public String accelerate(long mph) {
        return "The vehicle accelerates at : " + mph + " MPH.";
    }

    public String stop() {
        return "The vehicle has stopped.";
    }

    public String run() {
        return "The vehicle is running.";
    }
}