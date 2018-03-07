package com.aruvansh.findyourimage;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * Created by Aruvansh on 05/03/18.
 */
//this method is created for housekeeping that is to avoid mishap between the classes.so all classes now extend baseactivity
    //which in trun extends app compat.This class is responsible for controlling the search adn the travel of details from one class to another.
public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    static final String FLICKR_QUERY = "FLICKR_QUERY";
    static final String PHOTO_TRANSFER = "PHOTO_TRANSFER";

    void activateToolbar(boolean enableHome) {
        Log.d(TAG, "activateToolbar: starts");  //for enabling the search query and use the tool bar on the top
        ActionBar actionBar = getSupportActionBar();
        if(actionBar == null) {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

            if(toolbar != null) {
                setSupportActionBar(toolbar);
                actionBar = getSupportActionBar();
            }
        }

        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(enableHome);
        }
    }
}
