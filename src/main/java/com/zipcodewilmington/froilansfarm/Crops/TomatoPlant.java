package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Foods.Tomato;

public class TomatoPlant extends Crop {

    public Tomato yield() {
        if (hasBeenFertilized && !hasBeenHarvested) {
            hasBeenHarvested = true;
            hasBeenFertilized = false;
            return new Tomato();
        } else {
            return null;
        }
    }
}
