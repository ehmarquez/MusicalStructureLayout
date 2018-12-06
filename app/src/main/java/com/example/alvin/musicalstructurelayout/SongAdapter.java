package com.example.alvin.musicalstructurelayout;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * Custom constructor
     * @param context Current context, inflates the layout file
     * @param songs List of custom Song objects to display
     */
    public SongAdapter(Activity context, ArrayList<Song> songs){
        //Initialize ArrayAdapter's internal storage for the context and the list.
        //super relates to ArrayList's initial constructor?
        super(context, 0 , songs);
    }

    /**
     * Provides view for an AdapterView
     * @param position Position in list of data that should be displayed
     * @param convertView Recycled view that is populated
     * @param parent Parent ViewGroup that is inflated
     * @return View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get Song object located at this position in the list
        Song currentSong = getItem(position);

        //Find the TextView in the list_item layout for song name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.primary_text_view);
        // Get song name and set to text view
        songTextView.setText(currentSong.getmPrimaryInfo());

        //Find the TextView in the list_item layout for artist name
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.secondary_text_view);
        // Get artist name and set to text view
        artistTextView.setText(currentSong.getmSecondaryInfo());

        return listItemView;
    }
}
