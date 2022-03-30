package com.techreturners.cats;

public class LionCat extends Animal implements Cat {

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
