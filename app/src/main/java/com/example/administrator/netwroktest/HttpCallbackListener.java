package com.example.administrator.netwroktest;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
