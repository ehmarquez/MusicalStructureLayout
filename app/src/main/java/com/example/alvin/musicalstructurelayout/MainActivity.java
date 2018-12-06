package com.example.alvin.musicalstructurelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Use layout from activity_main
        setContentView(R.layout.activity_main);

        // Songs category with song name as primary info
        TextView songNamePrimary = (TextView) findViewById(R.id.songs_primary);

        // Click listener for above view
        songNamePrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open SongsActivity
                Intent songsIntent = new Intent(MainActivity.this,
                        SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Songs category with artist name as primary info
        TextView artistNamePrimary = (TextView) findViewById(R.id.artists_primary);

        // Click listener for above view
        artistNamePrimary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create intent to open ArtistsActivity
                Intent artistsIntent = new Intent(MainActivity.this,
                        SongsActivity.class);
                startActivity(artistsIntent);
            }
        });
    }
}
