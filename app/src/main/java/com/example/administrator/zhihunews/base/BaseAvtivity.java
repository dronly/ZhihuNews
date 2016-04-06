package com.example.administrator.zhihunews.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.Request;
import com.example.administrator.zhihunews.net.RequestManager;

/**
 * Created by Administrator on 2016/4/6.
 */
public class BaseAvtivity extends AppCompatActivity {
    Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState  ) {
        super.onCreate(savedInstanceState);
        mContext = this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RequestManager.cancelAll(this);
    }

    public void repleaceFragment(int id, Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(id, fragment);
        transaction.commit();
    }

    public void executeResquest(Request<?> resquest){
        RequestManager.addQueue(resquest, this);
    }
}
