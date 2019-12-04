package com.example.management;

import android.content.Context;

public class Management {

    private Context mContext = null;
    public Boolean w,d,r,m = null;

    public Management(Context context){
        this.mContext = context;

    }

    public void onMode(){
        MainActivity mainActivity = (MainActivity)mContext;
        mainActivity.onWrite(w);
        mainActivity.onDelete(d);
        mainActivity.onRead(r);
        mainActivity.onManagement(m);
    }
}
