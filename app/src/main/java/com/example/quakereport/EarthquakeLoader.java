package com.example.quakereport;


import android.content.AsyncTaskLoader;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<earthquakes>> {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    public EarthquakeLoader(@NonNull Context context, String url) {
        super(context);
        mUrl = url;
    }

    /**
     * This is on a background thread.
     */
    @Nullable
    @Override
    public List<earthquakes> loadInBackground() {
        if(mUrl==null){
            return null;
        }
        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<earthquakes> result = QueryUtils.fetchEarthquakeData(mUrl);
        return result;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

}
