package com.ramadan_apps.databindingbasics;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Mahmoud Ramadan on 2/8/18.
 */

public class MyHandlers {
    public void onCLickTemp(View view){
        Toast.makeText(view.getContext(),"temp is clicked",Toast.LENGTH_LONG).show();
    }
}
