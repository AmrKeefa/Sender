package com.example.firstapp;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        letsGo();
    }

    private void letsGo(){
    binding.letsGo.setOnClickListener(view -> {
        Intent intent = new Intent();
//        ComponentName componentName = new ComponentName("com.example.javapractice","com.example.javapractice.MyBroadCastReceiver");
//        intent.setComponent(componentName);
        intent.setClassName("com.example.javapractice","com.example.javapractice.MyBroadCastReceiver");
        sendBroadcast(intent);
    });
    }

}