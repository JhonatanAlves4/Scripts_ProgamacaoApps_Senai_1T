package com.example.appfrasedodia;

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
    public void gerarNovaFrase(View view){
        String [] frases = {
                "Se preocupe em espalhar o bem que a felicidade vem!",
                "Insista, persista e nunca desista.",
                "Seja feliz. Não aceite menos que isso.",
                "Coisas boas levam tempo.",
                "Nunca saberemos o quão forte somos até que ser forte seja a única escolha."
        };
        //sortear um numéro
        int posicaoSorteada = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.textViewResult);
        String fraseDoDia = frases[posicaoSorteada];
        texto.setText(fraseDoDia);
        //System.out.println();
    }
}