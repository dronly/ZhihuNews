package com.example.administrator.zhihunews.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;

import com.example.administrator.zhihunews.base.MyApplication;

/**
 * Created by Administrator on 2016/4/6.
 */
public class ThemeUtils {

    public static int defaultThemeColor = Color.rgb(00, 119, 117);
    private static Context context = MyApplication.getContext();
    public static void setThemeColor( int color){
        SharedPreferences.Editor editor = context
                .getSharedPreferences("ThemeColor", context.MODE_PRIVATE).edit();
        editor.putInt("themeColor", color);
        editor.commit();
    }

    public static int getThemeColor(){
        SharedPreferences pref = context.getSharedPreferences("ThemeColor",
                context.MODE_PRIVATE);
        return pref.getInt("themeColor", defaultThemeColor);
    }
}
