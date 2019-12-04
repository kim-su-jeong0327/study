package com.example.management;

import android.content.Context;

public class F_member extends Management {
    public F_member(Context context){
        super(context);
    }

    public void onMode(){
        super.w = true;
        super.d = true;
        super.r = true;
        super.m = false;
        super.onMode();
    }
}
