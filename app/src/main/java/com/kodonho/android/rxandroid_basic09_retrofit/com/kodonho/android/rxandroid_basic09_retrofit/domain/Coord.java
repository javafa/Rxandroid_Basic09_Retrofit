package com.kodonho.android.rxandroid_basic09_retrofit.com.kodonho.android.rxandroid_basic09_retrofit.domain;

/**
 * Created by fastcampus on 2016-11-04.
 */

public class Coord
{
    private String lon;

    private String lat;

    public String getLon ()
    {
        return lon;
    }

    public void setLon (String lon)
    {
        this.lon = lon;
    }

    public String getLat ()
    {
        return lat;
    }

    public void setLat (String lat)
    {
        this.lat = lat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [lon = "+lon+", lat = "+lat+"]";
    }
}
