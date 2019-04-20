package com.example.android.tourguideapp;

public class guide {

    private String mNamePlace;
    private String mWhereplace;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public guide(String namePlace, String wherePlace) {
        this.mNamePlace = namePlace;
        this.mWhereplace = wherePlace;
    }

    public guide(String namePlace, String wherePlace, int imageResourceId) {
        this.mNamePlace = namePlace;
        this.mWhereplace = wherePlace;
        this.mImageResourceId = imageResourceId;
    }

    public String getmNamePlace() {
        return mNamePlace;
    }

    public String getmWhereplace() {
        return mWhereplace;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
