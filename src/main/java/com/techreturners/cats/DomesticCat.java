package com.techreturners.cats;

public class DomesticCat extends Feline implements Cat {

    /**
     * Ensure Domestic Cats are domesticated!
     */
    public DomesticCat() {
        domesticated = true;
        averageHeight = 23;
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
