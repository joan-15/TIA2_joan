package com.joan.animacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    EditText etLargo, etAncho, etAngulo;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        etLargo = findViewById(R.id.etLargo);
        etAncho = findViewById(R.id.etAncho);
        etAngulo = findViewById(R.id.etAngulo);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double largo = Double.parseDouble(etLargo.getText().toString());
                double ancho = Double.parseDouble(etAncho.getText().toString());
                double angulo = Double.parseDouble(etAngulo.getText().toString());

                double area = largo * ancho;
                double perimetro = 2 * (largo + ancho);


                double anguloEnRadianes = Math.toRadians(angulo);
                double seno = Math.sin(anguloEnRadianes);
                double coseno = Math.cos(anguloEnRadianes);

                Intent intent = new Intent(CalculatorActivity.this, ResultActivity.class);
                intent.putExtra("area", area);
                intent.putExtra("perimetro", perimetro);
                intent.putExtra("seno", seno);
                intent.putExtra("coseno", coseno);
                startActivity(intent);
            }
        });
    }
}

