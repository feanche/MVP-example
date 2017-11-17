package com.example.alexander.mvp.data;

/**
 * Created by Alexander on 17.11.2017.
 */

public class DataManager {

    SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper){
        mSharedPrefsHelper=sharedPrefsHelper;
    }

    public void clear(){
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId(String email){
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmailId(){
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn(){
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public Boolean getLoggedInMode(){
        return mSharedPrefsHelper.getLoggedInMode();
    }
}
