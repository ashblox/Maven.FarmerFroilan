package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Foods.Edible;
import com.zipcodewilmington.froilansfarm.SharedStructure.Eater;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;

public class Person extends Eater {

    private int meals;

    public String makeNoise() {
        return "Woo-hoo!";
    }

    public void eat(Edible edible) {
        meals ++;
    }

    public void ride(Animal animal) {

    }

    public void ride(Vehicle vehicle) {

    }
}
