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
                        presenter.setNaviteHomePresenter();
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
}
