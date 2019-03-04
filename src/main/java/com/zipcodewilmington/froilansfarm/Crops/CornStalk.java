package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Foods.EarCorn;

public class CornStalk extends Crop {

    public EarCorn yield() {
        if (hasBeenFertilized && !hasBeenHarvested) {
            hasBeenFertilized = false;
            hasBeenHarvested = true;
            return new EarCorn();
        } else {
            return null;
        }
    }

}
