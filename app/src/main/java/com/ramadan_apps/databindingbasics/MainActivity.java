package com.ramadan_apps.databindingbasics;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ramadan_apps.databindingbasics.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =   DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setTemp(new TempratureData("Egypt", "30"));
       //event handler
        binding.setHandler(new MyHandlers());
    }
}
