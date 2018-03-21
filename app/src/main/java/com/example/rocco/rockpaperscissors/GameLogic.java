package com.example.rocco.rockpaperscissors;

import android.hardware.camera2.params.OutputConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by rocco on 21/03/2018.
 */

public class GameLogic {

    private Outcome computerChoice;

    public String playRound(Outcome playerChoice) {
        computerChoice = Outcome.randomChoice();

        return play(playerChoice, computerChoice);
    }

    public Outcome getComputerChoice() {
        return computerChoice;
    }

    public String play(Outcome playerChoice, Outcome computerChoice){

        HashMap<Outcome, Outcome> win = new HashMap<>();

        win.put(Outcome.ROCK, Outcome.SCISSORS);
        win.put(Outcome.SCISSORS, Outcome.PAPER);
        win.put(Outcome.PAPER, Outcome.ROCK);


        if(win.get(playerChoice)== computerChoice) {
            return "Player wins";
        }
        else if (win.get(computerChoice) == playerChoice){
            return "Computer wins";
        }
        else {
            return "Draw";
        }
    }





}
