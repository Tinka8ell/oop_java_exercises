package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends Feline implements Cat {

    private final Random rnd = new Random();

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
     * @return "Purrrrrrr" or "It will do I suppose"
     */
    @Override
    public String eat() {
        return (rnd.nextInt(10) < 3) ?
                "Purrrrrrr" :
                "It will do I suppose";
    }
}
