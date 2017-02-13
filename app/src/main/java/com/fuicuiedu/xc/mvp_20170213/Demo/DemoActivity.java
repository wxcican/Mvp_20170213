package com.fuicuiedu.xc.mvp_20170213.Demo;

import com.fuicuiedu.xc.mvp_20170213.MyMvp.MyMvpActivity;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class DemoActivity extends MyMvpActivity<DemoPresenter,DemoView> implements DemoView{

    @Override
    public DemoPresenter creatPresenter() {
        return new DemoPresenter();//把业务类返回出去
    }

    public void aaa(){
//        getPresenter().fdsafdas
    }
}
