package com.joan.animacion;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int DURACION_SPLASH = 3000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, CalculatorActivity.class);
            startActivity(intent);
            finish();
        }, DURACION_SPLASH);
    }
}

public class SplashActivity {
}
