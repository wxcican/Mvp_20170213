package com.fuicuiedu.xc.mvp_20170213;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 视图与业务
 * <p>
 * 视图（可见即为视图）
 * progressbar 加载动画
 * listView 展示数据
 * button 点击加载
 * <p>
 * 视图逻辑（操作，也属于视图）
 * progressbar 显示
 * progressbar 隐藏
 * setData 设置数据（改变listView，刷新）
 * <p>
 * 业务：
 * 获取到数据并且通知视图改变
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_lv)
    ListView mLv;
    @BindView(R.id.main_prb)
    ProgressBar mPrb;

    private List<String> mData;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mData = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mData);
        mLv.setAdapter(adapter);
    }

    @OnClick(R.id.main_btn)
    public void onClick() {
        //业务方面
        //点击加载数据
        new MainPresenter(this).loadData();
    }

    //    progressbar 显示
    public void showPrb() {
        mPrb.setVisibility(View.VISIBLE);
        mLv.setVisibility(View.GONE);
    }

    //    * progressbar 隐藏
    public void hidePrb() {
        mPrb.setVisibility(View.GONE);
        mLv.setVisibility(View.VISIBLE);
    }
//    * setData 设置数据（改变listView，刷新）
    public void setData(List<String> datas){
        adapter.addAll(datas);
        adapter.notifyDataSetChanged();
    }
}
