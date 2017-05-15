package com.osen.demo;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Osen Chan on 2017/2/25.
 */
public class StatuService extends IntentService{
    private static final Sring TAG = "StatuService";

    public StatuService() {
        super("StatuService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(Tag,"开始下载。。。");
        showNotification();
    }

    private void showNotification() {
        Notification notification = new Notification(R.drawable.h);
    }
}
