package com.example.myapplication;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class TestClickView extends View {

    public TestClickView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean superValue = super.dispatchTouchEvent(event);
        Log.d("TestClickView", getTag() + " dispatchTouchEvent superValue: " + superValue);
        return superValue;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean superValue = super.onTouchEvent(event);
        Log.d("TestClickView", getTag() + " onTouchEvent superValue: " + superValue);
        return true;
    }
}
