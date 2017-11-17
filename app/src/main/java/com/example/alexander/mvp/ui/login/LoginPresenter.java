package com.example.alexander.mvp.ui.login;

import com.example.alexander.mvp.data.DataManager;
import com.example.alexander.mvp.ui.base.BasePresenter;

/**
 * Created by Alexander on 17.11.2017.
 */

public class LoginPresenter<V extends LoginMvpView>extends BasePresenter<V> implements LoginMvpPresenter<V>{
    public LoginPresenter(DataManager dataManager){
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }
}
