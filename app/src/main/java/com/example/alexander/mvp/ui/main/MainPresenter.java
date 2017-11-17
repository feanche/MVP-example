package com.example.alexander.mvp.ui.main;

import com.example.alexander.mvp.data.DataManager;
import com.example.alexander.mvp.ui.base.BasePresenter;

/**
 * Created by Alexander on 17.11.2017.
 */

public class MainPresenter<V extends MainMvpView>extends BasePresenter<V>implements MainMvpPresenter<V>{
    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
