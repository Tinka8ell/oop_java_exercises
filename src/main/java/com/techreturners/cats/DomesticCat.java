package com.techreturners.cats;

public class DomesticCat extends Animal implements Cat {

    /**
     * Ensure Domestic Cats are domesticated!
     */
    public DomesticCat() {
        domesticated = true;
    }

    /**
     * A domestic cat tends to let our a purring sound when it eats.
     *
     * @return "Purrrrrrr"
     */
    @Override
    public String eat() {
        return "Purrrrrrr";
    }
}
