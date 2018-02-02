package com.ikai.unit.activities;
/**
 *
 * @Description:  This Activity will show a custom {@link android.widget.ListView}
 *          in listView the items will be arranged in view as shown in layout
 *          of trial_bag.
 *          you may have to implement additional classes and an adapter
 *          {@link com.ikai.unit.adapters.TrialAdapter} to adapt items in a custom
 *          recyclerView.
 * @Author:
 *
 * @StartingDate:
 * @EndingDate:
 *
 * @Copyright UNiT (An IKAI company product)
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ikai.unit.R;

public class TrialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trial);
    }
}
