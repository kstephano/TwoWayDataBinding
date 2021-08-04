package com.example.twowaydatabinding;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.databinding.Bindable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;

import com.example.twowaydatabinding.listener.OnClickListener;
import com.example.twowaydatabinding.model.UserData;
import com.example.twowaydatabinding.BR;

public class MainViewModel extends AndroidViewModel implements OnClickListener {

    private MutableLiveData<UserData> userData;
    private final MutableLiveData<String> input = new MutableLiveData<>();


    public MainViewModel(Application application) {
        super(application);
        /*
        userData = new MutableLiveData<>();
        userData.getValue().setInput("lol"););
        userData.getValue().setOutput("One way data binding");
         */

    }

    public MutableLiveData<String> getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input.setValue(input);
    }

    @Override
    public void onButtonClick(MutableLiveData<String> input) {
        Context context = getApplication().getApplicationContext();
        // show input if not empty
        if (!input.getValue().isEmpty()) {
            Toast.makeText(context,
                    "Your input: " + input.getValue(),
                    Toast.LENGTH_SHORT).show();
        }
    }


}
