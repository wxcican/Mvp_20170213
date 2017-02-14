package com.fuicuiedu.xc.mvp_20170213.MyMvp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public abstract class MyMvpActivity<P extends MyMvpPresenter,
        V extends MyMvpView> extends AppCompatActivity
        implements MyMvpView{

    //创建业务类，一定要实现
    public abstract P createPresenter();

    //持有业务类对象
    private P p;

    //经常要用到业务类，所以写在父类，方便调用
    public P getPresenter(){
        return p;
    }
}
