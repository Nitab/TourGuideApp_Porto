package com.example.android.tourguideapp;

/**
 * Created by Anita on 15/06/2017.
 */

public class Curiosities {

    //Declare the variables for each of the texts of the list item
    private String mTitle;
    private String mDetail;
    //We declare a variable to store the resource ID of the image, which is an integer
    private int mImageID= NO_IMAGE_PROVIDED;
    // The previous line makes that when there is not an image for this variable,
    // is associated with the value of the constant that is defined in the following line.
    private static final int NO_IMAGE_PROVIDED = -1;


    //Create a constructor with the exact name of the class.
    public Curiosities(String vTitle, String vDetail, int vImageID ){

        //We instantiate the variables
        mTitle = vTitle;
        mDetail = vDetail;
        mImageID = vImageID;

    }

    //Create method get

    public String getmTitle() {
        return mTitle;
    }

    public String getmDetail() {
        return mDetail;
    }

    public int getmImageID() {
        return mImageID;
    }

    // Check if mImgeID has been placed any ID resorce, or on the contrary has been assigned the constant value
    // Returns true if there is a picture and false if there is not
    public boolean hasImage() {
        return mImageID!=NO_IMAGE_PROVIDED;
    }
}
