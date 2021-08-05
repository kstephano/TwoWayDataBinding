package com.example.twowaydatabinding.listener;

import androidx.lifecycle.MutableLiveData;

import com.example.twowaydatabinding.model.UserData;

public interface OnClickListener {
    void onButtonClick1(MutableLiveData<String> input1);
    void onButtonClick2(MutableLiveData<String> input2);
}
