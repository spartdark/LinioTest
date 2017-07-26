package com.spartdark.favorites;

import android.app.Application;
import android.content.Context;

/**
 * Created by spartdark on 25/07/17.
 */

public class MyApplication extends Application {
    public static Context mContext;

    //Mis metodos
    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }


}
