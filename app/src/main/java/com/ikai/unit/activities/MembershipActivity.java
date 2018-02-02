package com.ikai.unit.activities;


/**
 * @Description: This activity will be invoked from drawer in dashboard
 * activity when this activity will be invoked it will show all the
 * details shown in Layout and it should give options to buy membership
 * options available
 *
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

public class MembershipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership);
    }
}
