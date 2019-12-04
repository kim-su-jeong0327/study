package com.example.management;

import android.content.Context;

public class A_member extends Management {
    public A_member(Context context){
        super(context);
    }

    public void onMode(){
        super.w = true;
        super.d = false;
        super.r = false;
        super.m = false;
        super.onMode();
    }
}
