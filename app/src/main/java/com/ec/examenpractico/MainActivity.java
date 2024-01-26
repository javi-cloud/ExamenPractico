package com.ec.examenpractico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etPrimerParcial, etSegundoParcial;
    private Button btnCalcular;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrimerParcial = findViewById(R.id.etPrimerParcial);
        etSegundoParcial = findViewById(R.id.etSegundoParcial);
        btnCalcular= findViewById(R.id.btnCalcular);
        tvResultado = findViewById(R.id.tvTitulo);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularPromedio();
            }
        });

    }

    private void calcularPromedio() {
        String strPrimerParcial = etPrimerParcial.getText().toString();
        String strSegundoParcial = etSegundoParcial.getText().toString();

        if (strPrimerParcial.isEmpty() || strSegundoParcial.isEmpty()) {
            tvResultado.setText("Ingrese las notas en ambos parciales.");
            return;
        }

        double primerParcial = Double.parseDouble(strPrimerParcial);
        double segundoParcial = Double.parseDouble(strSegundoParcial);

        double promedio = (primerParcial + segundoParcial) / 2;

        tvResultado.setText("El promedio final es: " + promedio);
    }
}