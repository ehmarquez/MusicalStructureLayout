package com.example.alvin.musicalstructurelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create song list
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Jingle Bell Rock", "Bobby Helms"));
        songs.add(new Song("Blue Christmas", "Elvis Presley"));
        songs.add(new Song("White Christmas", "Idina Menzel"));
        songs.add(new Song("Baby It's Cold Outside", "Idina Menzel"));
        songs.add(new Song("Silver Bells", "Dean Martin"));
        songs.add(new Song("Run Rudolph Run", "Chuck Berry"));
        songs.add(new Song("Rudolph The Red Nose Reindeer", "Burl Ives"));
        songs.add(new Song("The Little Drummer Boy", "Bing Crosby"));
        songs.add(new Song("Sleigh Ride", "Andy Williams"));
        songs.add(new Song("Silent Night", "Carpenters"));
        songs.add(new Song("Do They Know It's Christmas?", "Band Aid"));


        /**
         * Create a SongAdapter whose data is a list of Strings.
         */
        SongAdapter songsInfoAdapter = new SongAdapter(this, songs);

        /**
         *  Find ListView object in the view hierarchy of the Activity.
         *  Refers to VistView in song_list.xml with matching id.
         */
        ListView listView = (ListView) findViewById(R.id.listview_songs);

        /**
         * Make the ListView use the SongAdapter.
         */
        listView.setAdapter(songsInfoAdapter);
    }

}
