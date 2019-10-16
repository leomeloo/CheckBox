package com.example.checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class OutroExemplo extends AppCompatActivity {

    CheckBox coxinha, fogazza, brotinho, pizzas;
    Button total;
    Double valorC = 4.00, valorF = 5.00, valorB = 10.00, valorP = 20.00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.outro_exemplo);

        coxinha = findViewById(R.id.checkBoxCoxinha);
        fogazza = findViewById(R.id.checkBoxFogazza);
        brotinho = findViewById(R.id.checkBoxBroto);
        pizzas = findViewById(R.id.checkBoxPizza);

        total = findViewById(R.id.btTotal);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double valorTotal = 0.0;
                /*DecimalFormat formato = new DecimalFormat("#.###");
                valorTotal = Double.valueOf(formato.format(valorTotal));*/

                if (coxinha.isChecked())
                    valorTotal += valorC;

                if (fogazza.isChecked())
                    valorTotal += +valorF;

                if (brotinho.isChecked())
                    valorTotal += +valorB;

                if (pizzas.isChecked())
                    valorTotal += +valorP;

                Toast.makeText(getApplicationContext(), "Valor total: R$" + valorTotal, Toast.LENGTH_SHORT).show();

                if (coxinha.isChecked() || fogazza.isChecked() || brotinho.isChecked() || pizzas.isChecked()) {
                } else {
                    Toast.makeText(getApplicationContext(), "Nenhuma opção selecionada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
