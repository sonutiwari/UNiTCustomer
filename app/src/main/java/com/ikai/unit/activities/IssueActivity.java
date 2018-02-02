package com.ikai.unit.activities;


/**
 * @Description: This class will be called when customer want
 * to generate an issue regarding the product he she bought
 * earlier. this activity will be invoked from order details
 * or cart activity.
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

public class IssueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue);
    }
}
