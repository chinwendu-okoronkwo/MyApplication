package com.example.myapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("An internal growth rate (IGR) is the highest level of growth achievable for a business without obtaining outside financing, and a firm's maximum internal growth rate is the level of business operations that can continue to fund and grow the company");
    }

    public LiveData<String> getText() {
        return mText;
    }
}