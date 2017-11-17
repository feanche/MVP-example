package com.example.alexander.mvp.ui.login;

import com.example.alexander.mvp.ui.base.MvpPresenter;

/**
 * Created by Alexander on 17.11.2017.
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {
    void startLogin(String emailId);
}
