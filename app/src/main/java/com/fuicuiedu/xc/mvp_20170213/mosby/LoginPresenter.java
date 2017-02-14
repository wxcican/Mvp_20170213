package com.fuicuiedu.xc.mvp_20170213.mosby;

import android.os.AsyncTask;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

public class LoginPresenter extends MvpNullObjectBasePresenter<LoginView>{

    public void login(){
        getView().showPrb();//显示进度条
        new LoginAsynvTask().execute();//执行异步任务
    }

    class LoginAsynvTask extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            getView().showMsg("登录成功！");
            getView().hidePrb();//隐藏加载动画
        }
    }
}
