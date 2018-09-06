package com.cursoandroid.toast.menssagenstoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnTeste;

    //Criando um atributo da classe main
    private static final int DURACAO_EXECUCAO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTeste = findViewById(R.id.btnTeste);

        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Usara o atributo duracao criado no Main
                //MainActivity.DURACAO_EXECUCAO
                Toast.makeText(getApplicationContext(), "Menssagem Teste", Toast.LENGTH_LONG).show();

            }
        });
    }
}
