package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout layout = findViewById(R.id.layout_relative);
        View view1 = new TestClickView(this);
//        View view1 = new TestRelativeLayout(this);
        view1.setBackgroundColor(Color.RED);
        View view2 = new TestClickView(this);
//        View view2 = new TestRelativeLayout(this);
        view2.setBackgroundColor(Color.BLUE);
        View view3 = new TestClickView(this);
//        View view3 = new TestRelativeLayout(this);
        view3.setBackgroundColor(Color.GREEN);
        view1.setTag("View1");
        view2.setTag("View2");
        view3.setTag("View3");
        layout.addView(view1, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.addView(view2, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        layout.addView(view3, new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }
}