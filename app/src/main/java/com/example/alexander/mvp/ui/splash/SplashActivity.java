package com.example.alexander.mvp.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.alexander.mvp.MvpApp;
import com.example.alexander.mvp.R;
import com.example.alexander.mvp.data.DataManager;
import com.example.alexander.mvp.ui.base.BaseActivity;
import com.example.alexander.mvp.ui.login.LoginActivity;
import com.example.alexander.mvp.MainActivity;




/**
 * Created by Alexander on 17.11.2017.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {
    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context){
        Intent intent=new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        DataManager dataManager=((MvpApp)getApplication()).getDataManager();
        mSplashPresenter=new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent= MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent=LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
