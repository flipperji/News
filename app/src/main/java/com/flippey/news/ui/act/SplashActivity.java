package com.flippey.news.ui.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.flippey.news.MainActivity;
import com.flippey.news.R;
import com.flippey.news.global.NewsApplication;
import com.flippey.news.utils.Constants;
import com.flippey.news.utils.SpUtils;

/**
 * @ Author      Flippey
 * @ Creat Time  2016/7/18 13:56
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
    }

    private void init() {
        NewsApplication.sHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isfirst = (boolean) SpUtils.get(SplashActivity.this, Constants.IS_FIRST_IN, true);
                if (isfirst) {
                    //如果是第一次进入就显示引导页
                    SpUtils.put(SplashActivity.this, Constants.IS_FIRST_IN, true);
                    startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                }else {
                    //进入主页
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
            }
        }, 2000);
    }
}