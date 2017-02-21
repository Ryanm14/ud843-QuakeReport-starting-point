package com.example.android.quakereport;

/**
 * Created by Ryan Miles on 2/18/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String mUrl;

    public Earthquake(double magnitude, String location, long date, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
