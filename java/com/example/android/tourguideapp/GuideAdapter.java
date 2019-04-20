package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<guide> {
    private int mColorResourceId;

    public GuideAdapter(Activity context, ArrayList<guide> Guide, int colorResoureId) {
        super(context, 0, Guide);
        this.mColorResourceId = colorResoureId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        guide currentlocation = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView placeName = listItemView.findViewById(R.id.place_text_view);
        // set this text on the name TextView
        placeName.setText(currentlocation.getmNamePlace());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView locationPlace = listItemView.findViewById(R.id.location_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationPlace.setText(currentlocation.getmWhereplace());
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        // Check if an image is provided for this word or not
        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentlocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentlocation.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
