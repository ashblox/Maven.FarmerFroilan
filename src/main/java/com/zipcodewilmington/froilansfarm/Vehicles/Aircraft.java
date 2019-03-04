package com.zipcodewilmington.froilansfarm.Vehicles;

public class Aircraft extends Vehicle {

    private boolean hasPassengers;

    public void mount() {
        hasPassengers = true;
    }

    public void dismount() {
        hasPassengers = false;
    }

    public void fly() {

    }
}
