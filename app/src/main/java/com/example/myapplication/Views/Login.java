package com.example.myapplication.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.myapplication.Interactors.User;
import com.example.myapplication.Interfaces.ILoginPresenter;
import com.example.myapplication.Interfaces.ILoginView;
import com.example.myapplication.Presenters.LoginPresenterImpl;
import com.example.myapplication.R;

import es.dmoral.toasty.Toasty;

public class Login extends AppCompatActivity implements ILoginView {

    EditText edtUsuario,edtPassword;
    Button btnLogin;
    ProgressBar progressBar;
    ILoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //Iniciar Componentes
        initComponents();
        //Init Presenter
        presenter = new LoginPresenterImpl(this);
        //Evento btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin(v);
            }
        });
    }

    private void initComponents() {
        edtUsuario = findViewById(R.id.edtUsuario);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        progressBar = findViewById(R.id.progressBar);
    }

    private void doLogin(View v){
        //Presenter
        presenter.procesarLogin(edtUsuario.getText().toString(), edtPassword.getText().toString());
    }

    @Override
    public void setErrorUser() {
        edtUsuario.setError("Campo Obligatorio!");
    }

    @Override
    public void setErrorPassword() {
        edtPassword.setError("Campo Obligatorio!");
    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void naviteToMainView(User usuario) {
        Intent intent = new Intent(Login.this, OtroActivity.class);
        intent.putExtra("usuLogin", usuario.getUser());
        intent.putExtra("passLogin", usuario.getPassword());
        startActivity(intent);
        finish();

        /*Intent intentImplicito = new Intent();
        intentImplicito.setAction(Intent.ACTION_SEND);
        intentImplicito.putExtra(Intent.EXTRA_TEXT, "Hola desde intent implicito");
        intentImplicito.setType("text/plain");
        if(intentImplicito.resolveActivity(getPackageManager() )!= null){
            startActivity(intentImplicito);
        }*/
    }

    @Override
    public void setErrorLogeo() {
        //Toast.makeText(this, "Los Datos Ingresados no son correctos!", Toast.LENGTH_SHORT).show();
        Toasty.error(this, "Los Datos Ingresados no son correctos!", Toast.LENGTH_SHORT).show();
    }
}
