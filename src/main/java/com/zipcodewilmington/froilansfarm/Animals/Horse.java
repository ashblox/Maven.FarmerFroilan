package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Foods.Edible;
import com.zipcodewilmington.froilansfarm.SharedStructure.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean mounted;
    private int meals;

    public void eat(Edible edible) {
        meals++;
    }

    public String makeNoise() {
        return "Neigh!";
    }

    public void mount() {
        mounted = true;
    }

    public void dismount() {
        mounted = false;
    }
}

