package com.cursoandroid.frasedodia.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtFrase;
    private Button btnNovaFrase;

    private String[] frases = {
            "Welcome to the jungle",
            "Fuck you mother fuck !",
            "Such my dick",
            "You is loser",
            "Mama eu caraioo !"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFrase = findViewById(R.id.txtFrase);
        btnNovaFrase = findViewById(R.id.btnNovaFrase);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomico = new Random();

                int numeroAleatorio = randomico.nextInt(frases.length);

                txtFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
