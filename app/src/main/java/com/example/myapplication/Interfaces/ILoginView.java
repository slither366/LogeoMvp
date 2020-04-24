package com.example.myapplication.Interfaces;

import com.example.myapplication.Interactors.User;

public interface ILoginView {

    void setErrorUser();
    void setErrorPassword();
    void showProgressBar();
    void hideProgressBar();
    void naviteToMainView(User usu);
    void setErrorLogeo();
}
