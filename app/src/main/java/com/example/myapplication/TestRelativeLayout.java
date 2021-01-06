package com.example.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class TestRelativeLayout extends RelativeLayout {

    public TestRelativeLayout(Context context) {
        super(context);
    }

    public TestRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TestRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean superValue = super.dispatchTouchEvent(event);
        Log.d("TestRelativeLayout", getTag() + " dispatchTouchEvent superValue: " + superValue);
        return superValue;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean superValue = super.onInterceptTouchEvent(ev);
        Log.d("TestRelativeLayout", getTag() + " onInterceptTouchEvent superValue: " + superValue);
        return superValue;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean superValue = super.onTouchEvent(event);
        Log.d("TestRelativeLayout", getTag() + " onTouchEvent superValue: " + superValue);
        return superValue;
    }
}
