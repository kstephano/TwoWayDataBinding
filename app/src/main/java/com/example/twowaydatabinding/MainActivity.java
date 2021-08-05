package com.example.twowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.example.twowaydatabinding.databinding.ActivityMainBinding;
import com.example.twowaydatabinding.listener.OnClickListener;
import com.example.twowaydatabinding.model.UserData;

public class MainActivity extends AppCompatActivity  {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainViewModel = new ViewModelProvider(
                this, new ViewModelProvider.AndroidViewModelFactory(getApplication())).
                get(MainViewModel.class);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.setViewmodel(mainViewModel);
        binding.setOnclicklistener(mainViewModel);
        setContentView(binding.getRoot());

        mainViewModel.getInput().observe(this, s -> {
            binding.textViewOutput.setText(s);
        });

        mainViewModel.getOutput().observe(this, s -> {
            binding.textViewButtonOutput.setText(s);
        });
    }
}