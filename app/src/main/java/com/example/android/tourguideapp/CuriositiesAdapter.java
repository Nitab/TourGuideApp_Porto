package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anita on 15/06/2017.
 */

public class CuriositiesAdapter extends ArrayAdapter<Curiosities> {

    //The constructor is created
    public CuriositiesAdapter(@NonNull Context context, ArrayList<Curiosities> curiosity) {
        super(context, 0, curiosity);
    }

    //This method (getView) has to construct a new View object that will be visualized in the position position
    //The convertView is to start from a generic view to be faster, and the parent is the view container to which it is going to be added
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //The variable is instantiated
        View listItemView = convertView;

        //Check if the listItemView exist.
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //the current object is found
        Curiosities currentCuriosity = getItem(position);

        //the views are activated
        TextView item_txv_title = (TextView) listItemView.findViewById(R.id.item_txv_title);
        TextView item_txv_detail = (TextView) listItemView.findViewById(R.id.item_txv_detail);
        ImageView item_image = (ImageView) listItemView.findViewById(R.id.item_image);

        //the current object is wrote in the recicleView
        assert currentCuriosity != null;//Check the currentCuriosity is not null
        item_txv_title.setText(currentCuriosity.getmTitle());
        item_txv_detail.setText(currentCuriosity.getmDetail());

        //To write the image is more complicate, first check that the image has been found
        if (currentCuriosity.hasImage()) {
            //Get the Id resoruce, then look for the image with these resource and put it in the recycleView.
            item_image.setImageResource(currentCuriosity.getmImageID());
        }

        return listItemView;
    }
}
