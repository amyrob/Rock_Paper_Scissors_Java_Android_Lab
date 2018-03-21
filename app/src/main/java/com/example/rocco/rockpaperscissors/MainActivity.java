package com.example.rocco.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GameLogic gameLogic;
    private Outcome playerOutcome, computerOutcome;
    private TextView outcomeTextView;
    private TextView outcomeTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameLogic = new GameLogic();
        outcomeTextView = findViewById(R.id.outcome_textview);

    }

    public void onButtonClicked(View button) {



        if (button.getId() == R.id.rock_button) {
            playerOutcome = Outcome.ROCK;
            outcomeTextView.setText(gameLogic.playRound(playerOutcome));



        }
        else if (button.getId() == R.id.paper_button) {
            playerOutcome = Outcome.PAPER;
            outcomeTextView.setText(gameLogic.playRound(playerOutcome));
        }
        else if (button.getId() == R.id.scissor_button) {
            playerOutcome = Outcome.SCISSORS;
            outcomeTextView.setText(gameLogic.playRound(playerOutcome));
        }

    }
}
