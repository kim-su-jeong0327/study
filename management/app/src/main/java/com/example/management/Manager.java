package com.example.management;

import android.content.Context;

public class Manager extends Management {
    public Manager(Context context){
        super(context);
    }

    public void onMode(){
        super.w = true;
        super.d = true;
        super.r = true;
        super.m = true;
        super.onMode();
    }
}
