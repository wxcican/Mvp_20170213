package com.fuicuiedu.xc.mvp_20170213.MyMvp;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public abstract class MyMvpActivity<P extends MyMvpPresenter,
        V extends MyMvpView> implements MyMvpView {


    //构建业务类,一定要实现（抽象）
    public abstract P creatPresenter();

    //业务类
    private P p;

    //拿到我的业务类，方便调用
    public P getPresenter() {
        return p;
    }
}
