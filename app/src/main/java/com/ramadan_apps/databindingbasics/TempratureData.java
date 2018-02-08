package com.ramadan_apps.databindingbasics;

/**
 * Created by Mahmoud Ramadan on 2/8/18.
 */

public class TempratureData {

    public TempratureData(String location ,String temp){
        this.location = location;
        this.celisus = temp;
    }

    private String location;
    private  String celisus;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCelisus() {
        return celisus;
    }

    public void setCelisus(String celisus) {
        this.celisus = celisus;
    }
}
