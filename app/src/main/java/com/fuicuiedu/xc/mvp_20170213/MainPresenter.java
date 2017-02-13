package com.fuicuiedu.xc.mvp_20170213;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

public class MainPresenter {
    private List<String> mData;
    private MainActivity mainActivity;

    public MainPresenter(MainActivity mainActivity){
        mData = new ArrayList<>();
        this.mainActivity = mainActivity;
    }

    public void loadData() {
        //异步加载数据
        mainActivity.showPrb();//显示加载动画
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();
    }

    //新建异步任务，模拟网络加载数据，三秒后加入假数据
    // 三种泛型类型分别代表“启动任务执行的输入参数”、“后台任务执行的进度”、
// “后台计算结果的类型”。在特定场合下，并不是所有类型都被使用，
// 如果没有被使用，可以用Java.lang.Void类型代替。
    class MyAsyncTask extends AsyncTask<Void, Void, Void> {
            @Override
            protected Void doInBackground(Void... params) {
                //沉睡3秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

        //当后台操作结束时，此方法会被调用
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            //添加假数据
            for (int i = 0; i < 30; i++) {
                mData.add("第" + i + "条数据");
            }
            mainActivity.setData(mData);
            mainActivity.hidePrb();//隐藏加载动画
        }
    }
}
