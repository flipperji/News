package com.flippey.news.ui.home;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

/**
 * @ Author      Flippey
 * @ Creat Time  2016/7/19 10:12
 */
public class GoverPage extends BasePage {
    public GoverPage(Context context) {
        super(context);
    }

    @Override
    public View initView(Context context) {
        TextView textView = new TextView(context);
        textView.setText("goverpage");
        textView.setTextColor(Color.RED);
        return textView;
    }

    @Override
    public void initData() {

    }
}
