package com.scytalys;

import Actions.*;

public class BreakfastSequential {

    public static void makeBreakfastSequentially() {

        long startingTime = System.currentTimeMillis();

        BoilWater boilWater = new BoilWater();
        MakeToast makeToast = new MakeToast();
        BoilEgg boilEgg = new BoilEgg();
        BrewCoffee brewCoffee = new BrewCoffee();
        BlendSmoothie blendSmoothie = new BlendSmoothie();

        boilWater.run();
        makeToast.run();
        boilEgg.run();
        brewCoffee.run();
        blendSmoothie.run();

        long endingTime = System.currentTimeMillis();

        System.out.println("Breakfast is ready!");
        System.out.println("Time elapsed = " + (endingTime - startingTime) + " milliseconds");
    }

    public static void main(String[] args) {
        makeBreakfastSequentially();
    }
}
