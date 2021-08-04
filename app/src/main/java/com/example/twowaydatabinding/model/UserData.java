package com.example.twowaydatabinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.example.twowaydatabinding.BR;

public class UserData extends BaseObservable {
    private MutableLiveData<String> input;
    private String output;

    public UserData() {
    }

    public MutableLiveData<String> getInput() {
        if (input == null) {
            input = new MutableLiveData<String>();
        }
        return input;
    }

    public void setInput(MutableLiveData<String> input) {
        this.input = input;
    }


    public String getOutput() {
        if (output != null) {
            return output;
        }
        return "";
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
