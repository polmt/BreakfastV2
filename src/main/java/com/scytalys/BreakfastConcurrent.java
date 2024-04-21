package com.scytalys;

import Actions.*;

public class BreakfastConcurrent {

    public static void makeBreakfastConcurrently() {

        long startingTime = System.currentTimeMillis();

        Thread boilWaterThread = new Thread(new BoilWater());
        Thread makeToastThread = new Thread(new MakeToast());
        Thread boilEggThread = new Thread(new BoilEgg());
        Thread brewCoffeeThread = new Thread(new BrewCoffee());
        Thread blendSmoothieThread = new Thread(new BlendSmoothie());

        boilWaterThread.start();
        makeToastThread.start();
        boilEggThread.start();
        brewCoffeeThread.start();
        blendSmoothieThread.start();

        try {
            boilWaterThread.join();
            makeToastThread.join();
            boilEggThread.join();
            brewCoffeeThread.join();
            blendSmoothieThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endingTime = System.currentTimeMillis();

        System.out.println("Breakfast is ready!");
        System.out.println("Time elapsed = " + (endingTime - startingTime) + " milliseconds");
    }

    public static void main(String[] args) {
        makeBreakfastConcurrently();
    }
}
