package com.example.administrator.zhihunews.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.administrator.zhihunews.MainActivity;
import com.example.administrator.zhihunews.R;

import butterknife.Bind;

/**
 * Created by Administrator on 2016/4/6.
 */
public class SplashActivity extends AppCompatActivity {

    @Bind(R.id.background)
    RelativeLayout background;
    @Bind(R.id.image)
    ImageView image;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//        ButterKnife.bind(this);
//        background.setBackgroundColor(ThemeUtils.getThemeColor());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, 2200);//给postDelayed()方法传递延迟参数
    }

}
