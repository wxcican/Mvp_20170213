package com.fuicuiedu.xc.mvp_20170213.register;

import android.os.AsyncTask;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class RegisterPresenter {

    private RegisterView registerView;

    public RegisterPresenter(RegisterView registerView){
        this.registerView = registerView;
    }

    public void register(){
        registerView.showPrb();//显示加载动画
        new MyAsyncTask().execute();
    }

    class MyAsyncTask extends AsyncTask<Void,Void,Void>{
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
            registerView.showMsg("注册成功！");
            registerView.hidePrb();
        }
    }
}
