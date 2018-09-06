package com.cursoandroid.idadedecachorro.idadedecachorro;

import android.annotation.SuppressLint;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtIdade;
    private Button btnIdade;
    private TextView txtResultado;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIdade = (EditText) findViewById(R.id.txtIdadeId);
        btnIdade = (Button) findViewById(R.id.btnIdadeId);
        txtResultado = (TextView) findViewById(R.id.txtResultadoId);

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o que foi digitado
                String idadeInformada = txtIdade.getText().toString();

                if (idadeInformada.isEmpty()){
                    //String vazia, msg de erro
                    txtResultado.setText("Nenhum numero digitado !");
                }
                else{
                    int valorDIgitado = Integer.parseInt(idadeInformada);
                    int resultado = valorDIgitado * 7;

                    txtResultado.setText("A idade do cachorro em anos humanos e: " + resultado + " anos.");
                }

            }
        });

    }
}
