package com.ramadan_apps.databindingbasics;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Mahmoud Ramadan on 2/8/18.
 */

public class TempratureData extends BaseObservable {

    public TempratureData(String location ,String temp){
        this.location = location;
        this.celisus = temp;
    }

    private String location;
    private  String celisus;

    @Bindable
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }

    @Bindable
    public String getCelisus() {
        return celisus;
    }

    public void setCelisus(String celisus) {
        this.celisus = celisus;
        notifyPropertyChanged(BR.celisus);
    }
}
