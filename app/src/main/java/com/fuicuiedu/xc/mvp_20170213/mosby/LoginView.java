package com.fuicuiedu.xc.mvp_20170213.mosby;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

public interface LoginView extends MvpView{

    void showPrb();

    void hidePrb();

    void showMsg(String msg);

}
