package com.example.management;

import android.content.Context;

public class General_member extends Member {
    public General_member(Context context) {

        super(context);

       super.m = false;
       super.d = false;
       super.w = false;
      super.onMode();
    }
}
