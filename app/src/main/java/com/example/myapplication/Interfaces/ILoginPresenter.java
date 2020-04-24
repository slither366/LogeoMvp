package com.example.myapplication.Interfaces;

public interface ILoginPresenter {

    void procesarLogin(String user, String password);
    void setErrorUserPresenter();
    void setErrorPassPreseter();
    void setNaviteHomePresenter();
    void setErrorLogeoPresenter();
}
