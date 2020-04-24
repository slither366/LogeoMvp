package com.example.myapplication.Interactors;

import android.os.Handler;

import com.example.myapplication.Interfaces.ILoginInteractor;
import com.example.myapplication.Interfaces.ILoginPresenter;

public class LoginInteractorImpl implements ILoginInteractor {

    ILoginPresenter presenter;

    public LoginInteractorImpl(ILoginPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void procesarLogeo(final String user, final String pass) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(!user.equals("") && !pass.equals("")){
                    if(user.equals("dflores") && pass.equals("fllud001")){
                        crearNuevoUsuario("dflores","fllud001");
                    }else{
                        presenter.setErrorLogeoPresenter();
                    }
                }else{
                    if(user.equals("")){
                        presenter.setErrorUserPresenter();
                    }
                    if(pass.equals("")){
                        presenter.setErrorPassPreseter();
                    }
                }
            }
        },2000);

    }

    @Override
    public void crearNuevoUsuario(String user, String pass) {
        User usuario= new User();
        usuario.setUser(user);
        usuario.setPassword(pass);
        presenter.setNaviteHomePresenter(usuario);
    }


}
