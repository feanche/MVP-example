package com.example.alexander.mvp.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alexander.mvp.MvpApp;
import com.example.alexander.mvp.R;
import com.example.alexander.mvp.data.DataManager;
import com.example.alexander.mvp.ui.base.BaseActivity;
import com.example.alexander.mvp.ui.splash.SplashActivity;

/**
 * Created by Alexander on 17.11.2017.
 */

public class MainActivity extends BaseActivity implements MainMvpView {
    TextView textViewShow;
    Button buttonLogout;
    MainPresenter mainPresenter;

    public static Intent getStartIntent(Context context){
        Intent intent=new Intent(context,MainActivity.class);
        return intent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataManager dataManager=((MvpApp)getApplication()).getDataManger();
        mainPresenter=new MainPresenter(dataManager);
        mainPresenter.onAttach(this);
        textViewShow=(TextView)findViewById(R.id.textViewShow);
        buttonLogout=(Button)findViewById(R.id.buttonLogout);
        textViewShow.setText(mainPresenter.getEmailId());

        buttonLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        Intent intent= SplashActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}
