package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox ckCorinthians, ckBahia, ckCeara, ckFortaleza;
    Button selecionar, outros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckCorinthians = findViewById(R.id.checkBoxCorinthians);
        ckBahia = findViewById(R.id.checkBoxBahia);
        ckCeara = findViewById(R.id.checkBoxCeara);
        ckFortaleza = findViewById(R.id.checkBoxFortaleza);


        selecionar = findViewById(R.id.btSel);
        outros = findViewById(R.id.outros);

        selecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String times = "";

                if(ckCorinthians.isChecked())
                    times = "Corinthians";

                if(ckBahia.isChecked())
                    times += "\nBahia";

                if(ckCeara.isChecked())
                    times += "\nCeara";

                if(ckFortaleza.isChecked())
                    times += "\nFortaleza";

                Toast.makeText(getApplicationContext(),times, Toast.LENGTH_SHORT).show();

                if (ckCorinthians.isChecked() || ckBahia.isChecked() || ckCeara.isChecked() || ckFortaleza.isChecked()) {
                } else {
                    Toast.makeText(getApplicationContext(), "Nenhuma opção selecionada", Toast.LENGTH_LONG).show();
                }
            }
        });

        outros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent outroExemplo = new Intent(MainActivity.this, OutroExemplo.class);
                startActivity(outroExemplo);

            }
        });
    }
}
