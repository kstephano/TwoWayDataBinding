package com.example.twowaydatabinding.listener;

import androidx.lifecycle.MutableLiveData;

import com.example.twowaydatabinding.model.UserData;

public interface OnClickListener {
    void onButtonClick(MutableLiveData<String> input);
}
