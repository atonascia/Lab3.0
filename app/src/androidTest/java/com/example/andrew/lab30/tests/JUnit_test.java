package com.example.andrew.lab30.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.andrew.lab30.MainActivity;
import com.example.andrew.lab30.R;

/**
 * Created by Andrew on 4/18/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;

    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView)mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World!", tester);
    }

}
