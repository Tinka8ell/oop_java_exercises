package com.techreturners.cats;

public class CheetahCat extends Animal implements Cat {
    /**
     * A cheetah will let out a snoring sound as it becomes tired following a chase.
     *
     * @return "Zzzzzzz"
     */
    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
