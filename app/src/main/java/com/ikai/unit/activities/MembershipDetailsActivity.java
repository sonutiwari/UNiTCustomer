package com.ikai.unit.activities;


/**
 * @Description: If user want to see his current membership details then
 * he should go into this activity. see layout for other details.
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

public class MembershipDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_details);
    }
}
