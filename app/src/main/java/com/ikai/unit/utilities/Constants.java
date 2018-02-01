package com.ikai.unit.utilities;

import com.ikai.unit.R;

/**
 * Created by shiv on 25/11/17.
 */

public class Constants {

    // Variable to hold height of a product card in dp.
    public static final int PRODUCT_CARD_HEIGHT = 248;

    // Store all icons and item name for navigation drawer here.
    public static final String[] DRAWER_ITEM_NAMES = {
            "Category", "Star Membership", "Order Details",
            "Customer Care", "About Us", "FAQ"
    };
    public static final int[] DRAWER_ITEM_ICONS_IDS = {
            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher
            , R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher
    };

    // Read external storage request code.
    public static final int READ_EXTERNAL_STORAGE_REQUEST = 500;
}
