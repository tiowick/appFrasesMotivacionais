package com.cursotelegram.test.aula5;

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
    public void mudarFrase(View view){
        String[] frase = {
                "Você é o projeto mais impotante em que deve Trabalhar.",
                "O caminho para começar, é parar de falar e começar a fazer.",
                "Se ainda venta não adianta varrer, espere o momento certo para agir.",
                "A vida começa quando a zona de conforto termina.",
                "Só vence amanhã se não desistir hoje.",
                "Não coloque limite em seus sonhos, coloque fé.",
                "LEMBRETE, tudo que você toca, florece."
        };
        int numAleatorio = new Random().nextInt(7);
        TextView fraseText;
        fraseText = findViewById(R.id.textFrase);
        fraseText.setText(frase[numAleatorio]);

    }
}
