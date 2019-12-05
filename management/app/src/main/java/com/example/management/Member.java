package com.example.management;

import android.content.Context;

public class Member implements Mode {

    private Context mContext = null;
    public Boolean w,d,r,m = null;

    public Member(Context context){
        this.mContext = context;

    }

    public void onMode(){
        MainActivity mainActivity = (MainActivity)mContext;
    }

    @Override
    public void write(Boolean w) {
//        w=true;
    }

    @Override
    public void delete(Boolean d) {
//        d=true;
    }

    @Override
    public void read(Boolean r) {
//        r = true;
    }

    @Override
    public void manage(Boolean m) {
//        m=true;
    }
}
