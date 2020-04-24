package com.example.myapplication.Presenters;

import com.example.myapplication.Interactors.LoginInteractorImpl;
import com.example.myapplication.Interactors.User;
import com.example.myapplication.Interfaces.ILoginInteractor;
import com.example.myapplication.Interfaces.ILoginPresenter;
import com.example.myapplication.Interfaces.ILoginView;

public class LoginPresenterImpl implements ILoginPresenter {

    ILoginView view;
    ILoginInteractor interactor;

    public LoginPresenterImpl(ILoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void procesarLogin(String user, String password) {
        //Interactor
        if(view!=null){
            view.showProgressBar();
        }
        interactor.procesarLogeo(user, password);
    }

    @Override
    public void setErrorUserPresenter() {
        if(view!=null){
            view.hideProgressBar();
            view.setErrorUser();
        }
    }

    @Override
    public void setErrorPassPreseter() {
        if(view!=null){
            view.hideProgressBar();
            view.setErrorPassword();
        }
    }

    @Override
    public void setNaviteHomePresenter(User usu) {
        if(view!=null){
            view.hideProgressBar();
            view.naviteToMainView(usu);
        }
    }

    @Override
    public void setErrorLogeoPresenter() {
        if(view!=null){
            view.hideProgressBar();
            view.setErrorLogeo();
        }
    }


}
