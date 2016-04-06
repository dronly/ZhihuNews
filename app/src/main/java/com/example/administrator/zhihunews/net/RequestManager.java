package com.example.administrator.zhihunews.net;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.administrator.zhihunews.base.MyApplication;

/**
 * Created by Administrator on 2016/4/6.
 */
public class RequestManager {

    public static final int OUT_TIME = 10000;
    public static final int TIMES_OF_RETRY = 1;
    private static RequestQueue mRequestQueue = Volley.newRequestQueue(MyApplication.getContext());


    public static void addQueue(Request<?> request,Object tag) {
        if (tag != null) {
            request.setTag(tag);
        }
        request.setRetryPolicy(new DefaultRetryPolicy(OUT_TIME, TIMES_OF_RETRY,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        mRequestQueue.add(request);

    }

    public static void cancelAll(Object tag) {
        mRequestQueue.cancelAll(tag);
    }

    public static void clearCache(){
        mRequestQueue.getCache().clear();
    }

}
