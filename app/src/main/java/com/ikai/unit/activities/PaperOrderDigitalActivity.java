package com.ikai.unit.activities;

/**
 * @Description: This feature will be invoked from main search activity and
 * if user chose to order via paper order by upldating his list in application
 * then this class should do necessary steps to provide this facility
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

public class PaperOrderDigitalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper_order_digital);
    }
}
