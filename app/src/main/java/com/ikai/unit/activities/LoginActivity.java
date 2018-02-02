package com.ikai.unit.activities;

/**
 * @Description: After activity_splash.xml this class will check if user is already logged in
 * if
 *  user is logged in then it will check if user is registered or not
 *  if
 *      user is registered then it will send user to activity_dashboard.xml via
 *      DashBoardActivity.class
 *  else
 *      it will send user to activity_register.xml and RegisterActivity.java
 * if
 *  user is not logged in then let him log in through FirebaseUI and then check for register
 *  conditions and take action accordingly.
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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
