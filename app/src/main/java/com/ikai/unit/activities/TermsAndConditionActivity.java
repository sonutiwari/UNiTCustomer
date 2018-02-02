package com.ikai.unit.activities;

/**
 * @Description: This class will set the activity to activity_terms_and_condition.xml
 *      if user click on terms & condition button in activity_splash_and_register.xml
 *      then this class should be called to show terms and condition of our company.
 *
 * @Author:
 *
 * @StartDate:
 * @EndDate:
 *
 * @Copyright UNiT (An IKAI company product)
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ikai.unit.R;

public class TermsAndConditionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_condition);
    }
}
