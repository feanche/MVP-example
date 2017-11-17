package com.example.alexander.mvp.ui.main;

import com.example.alexander.mvp.ui.base.MvpPresenter;

/**
 * Created by Alexander on 17.11.2017.
 */

public interface MainMvpPresenter<V extends MainMvpView>extends MvpPresenter<V> {
    String getEmailId();
    void setUserLoggedOut();
}
