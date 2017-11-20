package com.example.alexander.mvp.ui.splash;

import com.example.alexander.mvp.data.DataManager;
import com.example.alexander.mvp.ui.base.BasePresenter;

/**
 * Created by Alexander on 17.11.2017.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>implements SplashMvpPresenter<V> {
    public SplashPresenter(DataManager dataManager){
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if(getDataManager().getLoggedInMode()){
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}
