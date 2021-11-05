package com.example.androit1hw5;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androit1hw5.databinding.ActivityMainBinding;

import FirstFragment.FirstFragment;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);
        start();

    }
    private void start(){
        getSupportFragmentManager().beginTransaction().add(R.id.conteyner,new FirstFragment()).commit();
    }
}