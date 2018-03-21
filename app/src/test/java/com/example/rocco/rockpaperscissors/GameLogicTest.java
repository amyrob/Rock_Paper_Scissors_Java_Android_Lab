package com.example.rocco.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rocco on 21/03/2018.
 */

public class GameLogicTest {

    Outcome playerChoice, computerChoice;

    GameLogic gameLogic;

    @Before
    public void before() {
        gameLogic = new GameLogic();
    }

    @Test
    public void canPlayGame() {
        assertEquals("Computer wins", GameLogic.play(Outcome.ROCK, Outcome.PAPER));
    }
}

