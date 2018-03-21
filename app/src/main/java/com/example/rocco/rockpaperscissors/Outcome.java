package com.example.rocco.rockpaperscissors;

import java.util.Random;

/**
 * Created by rocco on 21/03/2018.
 */

public enum Outcome {

    ROCK,
    PAPER,
    SCISSORS;


    public static Outcome randomChoice() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }


}
