package com.techreturners.cats;

public class LionCat extends Feline implements Cat {

    /**
     * Lion Cats a smidge taller than the average animal!
     */
    public LionCat() {
        averageHeight = 1100;
    }

    /**
     * A Lion will let out a victorious roar when they eat
     *
     * @return "Roar!!!!"
     */
    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
