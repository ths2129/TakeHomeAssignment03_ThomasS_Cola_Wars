package com.example.takehomeassignment03_thomass_cola_wars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int pepsi = 0;
    int cola = 0;
    int resultPep = 0;
    int resultCo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void voteCola(View view) {
        cola = cola + 1;
        //displayColaVotes(cola - 1);
    }

    public void voteColaNo(View view){
        cola = cola - 1;
       // displayColaVotes(cola);
    }

    public void votePepsi(View view) {
        pepsi = pepsi + 1;
      // displayPepsiVotes(pepsi);
    }

    public void votePepsiNo(View view){
        pepsi = pepsi - 1;
       // displayPepsiVotes(pepsi);

    }

    public void end(View view){
        resultPep = pepsi;
        resultCo = cola;
        displayResults(resultCo);
        displayResults2(resultPep);
    }


    public void displayResults(int results){
        TextView theResults = (TextView) findViewById(R.id.results);
        theResults.setText(String.valueOf(results));
    }
    public void displayResults2(int results){
        TextView theResults = (TextView) findViewById(R.id.results2);
        theResults.setText(String.valueOf(results));
    }




}
