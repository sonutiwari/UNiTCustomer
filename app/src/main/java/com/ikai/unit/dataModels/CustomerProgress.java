package com.ikai.unit.dataModels;

/**
 * Created by shiv on 25/1/18.
 */

public class CustomerProgress {
    public boolean registered;

    // Default constructor required for calls to DataSnapshot.getValue(CustomerProgress.class)
    public CustomerProgress() {}

    public CustomerProgress(final boolean registered) {
        this.registered = registered;
    }

    void setRegistered() {
        this.registered = true;
    }

}
