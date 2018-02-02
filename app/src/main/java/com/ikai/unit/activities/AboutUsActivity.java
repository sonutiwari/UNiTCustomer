package com.ikai.unit.activities;


/**
 * @Description: This class will be called when user clicks on About Us
 *               in navigation drawer. It should be referenced as in
 *               given layout
 *
 *  @Author:
 *
 *  @StartingDate:
 *  @EndingDate:
 *
 *  @Copyright UNiT (An IKAI company product)
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ikai.unit.R;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }
}
