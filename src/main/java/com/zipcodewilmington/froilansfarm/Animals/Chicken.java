
package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Foods.Edible;
import com.zipcodewilmington.froilansfarm.Foods.Egg;
import com.zipcodewilmington.froilansfarm.SharedStructure.Produce;

public class Chicken extends Animal implements Produce {

    private int meals;
    private boolean hasBeenFertilized;

    public void eat(Edible edible) {
        meals ++;
    }

    public String makeNoise() {
        return "Cluck-cluck!";
    }

    public Edible yield() {
        if (hasBeenFertilized) {
            return new Egg();
        } else {
            return null;
        }
    }
}
