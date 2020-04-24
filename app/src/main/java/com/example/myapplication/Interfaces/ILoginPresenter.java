package com.example.myapplication.Interfaces;

import com.example.myapplication.Interactors.User;

public interface ILoginPresenter {

    void procesarLogin(String user, String password);
    void setErrorUserPresenter();
    void setErrorPassPreseter();
    void setNaviteHomePresenter(User usu);
    void setErrorLogeoPresenter();
}
