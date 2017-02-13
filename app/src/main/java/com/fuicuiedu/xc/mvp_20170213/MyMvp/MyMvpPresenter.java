package com.fuicuiedu.xc.mvp_20170213.MyMvp;

import android.content.Intent;

import java.util.List;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class MyMvpPresenter<View extends MyMvpView> {

    private View v;

    //经常要用View接口，所以写在父类，方便调用
    public View getView(){
        if (v == null){
            //抛异常，等等
        }
        return v;
    }
}
