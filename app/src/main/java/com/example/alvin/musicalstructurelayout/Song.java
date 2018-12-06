package com.example.alvin.musicalstructurelayout;

public class Song {

    // Primary info text member variable
    private String mPrimaryInfo;

    // Secondary info text member variable
    private String mSecondaryInfo;

    /**
     * @param primaryInfo   Name of song
     * @param secondaryInfo Name of artist for song
     */
    public Song(String primaryInfo, String secondaryInfo) {
        mPrimaryInfo = primaryInfo;
        mSecondaryInfo = secondaryInfo;
    }

    // Getter for song name
    public String getmPrimaryInfo() {
        return mPrimaryInfo;
    }

    // Getter for artist name
    public String getmSecondaryInfo() {
        return mSecondaryInfo;
    }

}
