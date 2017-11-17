package com.example.alexander.mvp;

import android.app.Application;

import com.example.alexander.mvp.data.DataManager;
import com.example.alexander.mvp.data.SharedPrefsHelper;

/**
 * Created by Alexander on 17.11.2017.
 */

public class MvpApp extends Application {
    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);

    }

    public DataManager getDataManager() {
        return dataManager;
    }
}
