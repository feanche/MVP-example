package com.example.alexander.mvp.ui.base;

/**
 * Created by Alexander on 17.11.2017.
 */

public interface MvpPresenter<V extends MvpView> {
    void onAttach(V mvpView);
}
