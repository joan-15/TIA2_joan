package com.joan.animacion;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    TextView tvResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResultados = findViewById(R.id.tvResultados);

        // Obteniendo los resultados del intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            double area = extras.getDouble("area");
            double perimetro = extras.getDouble("perimetro");
            double seno = extras.getDouble("seno");
            double coseno = extras.getDouble("coseno");

            // Construyendo el texto para mostrar
            String resultado = "Área: " + area +
                    "\nPerímetro: " + perimetro +
                    "\nSeno: " + seno +
                    "\nCoseno: " + coseno;

            tvResultados.setText(resultado);
        }
    }
}

