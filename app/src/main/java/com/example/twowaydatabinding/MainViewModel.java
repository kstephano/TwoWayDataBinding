package com.example.twowaydatabinding;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.twowaydatabinding.listener.OnClickListener;

public class MainViewModel extends AndroidViewModel implements OnClickListener {

    private final MutableLiveData<String> input = new MutableLiveData<>();
    private final MutableLiveData<String> output = new MutableLiveData<>();

    public MainViewModel(Application application) {
        super(application);
    }

    @Override
    public void onButtonClick1(MutableLiveData<String> input) {
        Context context = getApplication().getApplicationContext();
        // show input if not empty
        if (!input.getValue().isEmpty()) {
            Toast.makeText(context,
                    "Your input: " + input.getValue(),
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onButtonClick2(MutableLiveData<String> input2) {
        Context context = getApplication().getApplicationContext();

        // show input if not empty
        if (!input.getValue().isEmpty()) {
           output.setValue(input.getValue());
        }
        Toast.makeText(context,
                "Your output: " + output.getValue(),
                Toast.LENGTH_SHORT).show();
    }

    public MutableLiveData<String> getInput() {
        return input;
    }

    public MutableLiveData<String> getOutput() { return output; }

}
