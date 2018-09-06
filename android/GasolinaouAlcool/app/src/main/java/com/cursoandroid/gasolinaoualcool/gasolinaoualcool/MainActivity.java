package com.cursoandroid.gasolinaoualcool.gasolinaoualcool;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etAlcool;
    private EditText etGasolina;
    private Button btnVerificar;
    private TextView tvResultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Localizar componentes na tela
        etAlcool = (EditText) findViewById(R.id.etAlcool);
        etGasolina = (EditText) findViewById(R.id.etGasolina);
        btnVerificar = (Button) findViewById(R.id.btnVerificar);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar os valores digitados nos TextView
                String precoAlcool = etAlcool.getText().toString();
                String precoGasolina = etGasolina.getText().toString();

                //Converter os texto para valor
                Double valorAlcool = Double.parseDouble(precoAlcool);
                Double valorGasolina = Double.parseDouble(precoGasolina);

                //Calculos
                // Alcool / Gasolina
                double resultado = valorAlcool / valorGasolina;

                if(resultado >= 0.7){
                    //Gasolina
                    tvResultado.setText("É melhor utilizar Gasolina");
                }
                else{
                    //Alcool
                    tvResultado.setText("É melhor utilizar Álcool");
                }
            }
        });

    }
}
