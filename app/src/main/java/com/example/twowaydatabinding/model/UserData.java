package com.example.twowaydatabinding.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.lifecycle.MutableLiveData;

import com.example.twowaydatabinding.BR;

public class UserData extends BaseObservable {
    private String firstName;
    private String lastName;

    public UserData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = firstName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
