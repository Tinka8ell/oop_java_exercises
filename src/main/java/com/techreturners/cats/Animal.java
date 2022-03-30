package com.techreturners.cats;

public abstract class Animal {
    protected boolean domesticated = false; // default to wild
    protected int averageHeight = 100; // default to 1 metre
    protected boolean isAsleep = false; // default to awake

    /**
     * Getter for sleep state.
     *
     * @return true iff we are asleep
     */
    public boolean isAsleep() {
        return isAsleep;
    }

    /**
     * Minimal implementation of "go to sleep".
     */
    public void goToSleep() {
        isAsleep = true;
    }

    /**
     * Minimal implementation of "wake up".
     */
    public void wakeUp() {
        isAsleep = false;
    }

    /**
     * Getter for "setting".
     * Interpret internal boolean state as a String.
     *
     * @return "domestic" or "wild"
     */
    public String getSetting() {
        return (domesticated) ? "domestic" : "wild";
    }

    /**
     * Getter for "average height".
     * Minimal implementation is to return the field.
     *
     * @return average height in centimetres
     */
    public int getAverageHeight() {
        return averageHeight;
    }

    /**
     * Minimal implementation of "eat".
     *
     * @return null as not implemented
     */
    public abstract String eat();
}
