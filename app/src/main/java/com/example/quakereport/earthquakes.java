package com.example.quakereport;

public class earthquakes {
    private String mLocation;

    private double  mMagnitude;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    /**
     * Constructs a new {@link earthquakes} object.
     *
     * @param vMagnitude is the magnitude (size) of the earthquake
     * @param vLocation is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
    public earthquakes(double vMagnitude,String vLocation,long timeInMilliseconds,String url){
        mLocation = vLocation;
        mMagnitude = vMagnitude;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public String getLocation(){
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public double  getMagnitude(){
        return mMagnitude;
    }
    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

}
