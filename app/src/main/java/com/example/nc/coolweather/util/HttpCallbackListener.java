package com.example.nc.coolweather.util;

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
