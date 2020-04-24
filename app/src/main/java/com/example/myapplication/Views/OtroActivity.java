package com.example.myapplication.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class OtroActivity extends AppCompatActivity {

    TextView tvUsuario, tvPassword, tvDni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro);
        //INicializando Componentes
        initComponents();
        obtenerDatos();
    }

    private void initComponents() {
        tvUsuario = findViewById(R.id.tvUsuario);
        tvPassword = findViewById(R.id.tvPassword);
        tvDni = findViewById(R.id.tvDni);
    }

    private void obtenerDatos(){
        tvUsuario.setText(getIntent().getStringExtra("usuLogin"));
        tvPassword.setText(getIntent().getStringExtra("passLogin"));
    }
}
