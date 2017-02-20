package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ryan Miles on 2/18/2017.
 */

public class CustomArrayAdapter<E> extends ArrayAdapter<Earthquake> {

    public CustomArrayAdapter(@NonNull Context context, @NonNull ArrayList<Earthquake> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Earthquake} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.item_linear_layout);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.item_magnitude);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        magnitudeTextView.setText(currentEarthquake.getMagnitude() + "");

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.item_location);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationTextView.setText(currentEarthquake.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.item_date);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dateTextView.setText(currentEarthquake.getDate());



        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

