package com.cursoandroid.adivinha.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaoJogarId);
        Resultado = (TextView) findViewById(R.id.resultadoId);

        //Resultado.setText("Texto alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random nRandomico= new Random();

                int numeroRandomico = nRandomico.nextInt(10);

                Resultado.setText("Numero escolhido: " + numeroRandomico);
            }
        });
    }
}
