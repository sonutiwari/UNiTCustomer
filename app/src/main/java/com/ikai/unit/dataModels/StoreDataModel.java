package com.ikai.unit.dataModels;

/**
 * {@link StoreDataModel} represents a single Android platform release.
 * Each object has 3 properties: storeName, storeThumbnailImage, and
 * favoriteShop.
 * @Author: Sonu Tiwari(ankorha@gmail.com)
 *
 * @StartingDate: 08/02/2018
 * @EndingDate:
 *
 * @Copyright UNiT (An IKAI company product)
 */

public class StoreDataModel {

    private static final String LOG_TAG = StoreDataModel.class.getSimpleName();
    //This field will store name of the shop
    private String storeName;

    //This field will store URL of image resource in a String
    private String storeThumbnailImage;

    //This field will store if customer will favorite the store
    private boolean favoriteShop = false;

    /**
     *
     * @param storeName Name of the store
     * @param storeThumbnailImage image url of store image thumbnail
     * @param favoriteShop option to make a shop favourite
     */
    public StoreDataModel(String storeName, String storeThumbnailImage,
                          boolean favoriteShop) {
        this.storeName = storeName;
        this.storeThumbnailImage = storeThumbnailImage;
        this.favoriteShop = favoriteShop;
    }

    //overloading constructor for default values
    public StoreDataModel(String storeName, String storeThumbnailImage) {
        this.storeName = storeName;
        this.storeThumbnailImage = storeThumbnailImage;
        this.favoriteShop = false;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreThumbnailImage() {
        return storeThumbnailImage;
    }

    public void setStoreThumbnailImage(String storeThumbnailImage) {
        this.storeThumbnailImage = storeThumbnailImage;
    }

    public boolean isFavoriteShop() {
        return favoriteShop;
    }

    public void setFavoriteShop(boolean favoriteShop) {
        this.favoriteShop = favoriteShop;
    }


    @Override
    public String toString() {
        return "StoreDataModel{" +
                "storeName='" + storeName + '\'' +
                ", storeThumbnailImage='" + storeThumbnailImage + '\'' +
                ", favoriteShop=" + favoriteShop +
                '}';
    }
}
