package com.example.alexander.mvp.ui.base;

import com.example.alexander.mvp.data.DataManager;

/**
 * Created by Alexander on 17.11.2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    DataManager mDataManager;

    public BasePresenter(DataManager dataManager){
        mDataManager=dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView=mvpView;
    }

    public V getMvpView(){
        return mMvpView;
    }

    public DataManager getDataManager(){
        return mDataManager;
    }
}
