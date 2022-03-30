package com.techreturners.cats;

public class Feline extends Animal implements Cat{

    /**
     * Minimal implementation of "eat" for Felines.
     *
     * @return "Burp!"
     */
    @Override
    public String eat() {
        return "Burp!";
    }

}
