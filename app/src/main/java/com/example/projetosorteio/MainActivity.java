package com.example.projetosorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarNumero (View view){
        TextView number = findViewById(R.id.teste);

        int numero = new Random().nextInt(200);

            number.setText("Número sorteado foi: " + numero  );
    }
}
/*
    nesse projeto foi usado uma nova função para gerar numeros randomicos de 0 a 10

    foi criado a funcao INT ela recebeu o nome de numero que atribui
    a NEW RANDOW().NEXTINT(11)<- simplificando ficou assim

        minha variavel int chamada numero recebe new randow() com um proximoNumeroInteriro de 0 a 11



 */
