package com.fuicuiedu.xc.mvp_20170213.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fuicuiedu.xc.mvp_20170213.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 视图与业务
 *
 * 视图：、
 * 两个EditText
 * button
 * progressbar
 *
 * 视图操作:
 * progressbar 显示和隐藏
 * toast 显示提示信息
 *
 * 业务：
 * 网络注册请求，拿到结果，通知视图更新*/

public class RegisterActivity extends AppCompatActivity implements RegisterView{

    @BindView(R.id.register_prb)ProgressBar mPrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @Override
    public void showPrb() {
        mPrb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePrb() {
        mPrb.setVisibility(View.GONE);
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.register_btn)
    public void onClick(){
        new RegisterPresenter(this).register();
    }
}
