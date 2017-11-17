package com.example.alexander.mvp.data;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Alexander on 17.11.2017.
 */

public class SharedPrefsHelper {

    public static final String MY_PREFS="MY_PREFS";

    public static final String EMAIL="EMAIL";

    SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context){
        mSharedPreferences=context.getSharedPreferences(MY_PREFS, MODE_PRIVATE);
    }

    public void clear(){
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email){
        mSharedPreferences.edit().putString(EMAIL,null).apply();
    }

    public String getEmail(){
        return mSharedPreferences.getString(EMAIL,null);
    }

    public boolean getLoggedInMode(){
        return mSharedPreferences.getBoolean("IS_LOGGED_IN",false);
    }

    public void setLoggedInMode(boolean loggedIn){
        mSharedPreferences.edit().putBoolean("IS_LOGGED_IN",loggedIn).apply();
    }


}
