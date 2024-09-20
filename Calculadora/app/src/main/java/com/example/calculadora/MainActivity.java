package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;

    private EditText valor1;
    private EditText valor2;

    private Button somar;
    private Button subtrair;
    private Button multiplicar;
    private Button dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);

        somar = findViewById(R.id.somar);
        subtrair = findViewById(R.id.subtrair);
        multiplicar = findViewById(R.id.multiplicar);
        dividir = findViewById(R.id.dividir);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(valor1.getText().toString());
                Double num2 = Double.parseDouble(valor2.getText().toString());

                Double res = num1 + num2;
                resultado.setText(String.valueOf(res));
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(valor1.getText().toString());
                Double num2 = Double.parseDouble(valor2.getText().toString());

                Double res = num1 - num2;
                resultado.setText(String.valueOf(res));
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(valor1.getText().toString());
                Double num2 = Double.parseDouble(valor2.getText().toString());

                Double res = num1 * num2;
                resultado.setText(String.valueOf(res));
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(valor1.getText().toString());
                Double num2 = Double.parseDouble(valor2.getText().toString());

                Double res = num1 / num2;
                resultado.setText(String.valueOf(res));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}