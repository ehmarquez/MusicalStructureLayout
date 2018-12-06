package com.example.alvin.musicalstructurelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create song list
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song( "Andy Williams", "Sleigh Ride"));
        songs.add(new Song( "Band Aid", "Do They Know It's Christmas?"));
        songs.add(new Song( "Bing Crosby", "The Little Drummer Boy"));
        songs.add(new Song( "Bobby Helms", "Jingle Bell Rock"));
        songs.add(new Song( "Burl Ives", "Rudolph The Red Nose Reindeer"));
        songs.add(new Song( "Carpenters", "Silent Night"));
        songs.add(new Song( "Chuck Berry", "Run Rudolph Run"));
        songs.add(new Song( "Dean Martin", "Silver Bells"));
        songs.add(new Song( "Elvis Presley", "Blue Christmas"));
        songs.add(new Song( "Idina Menzel", "White Christmas"));
        songs.add(new Song( "Idina Menzel", "Baby It's Cold Outside"));

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
