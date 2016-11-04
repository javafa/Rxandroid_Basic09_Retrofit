package com.kodonho.android.rxandroid_basic09_retrofit;

import com.kodonho.android.rxandroid_basic09_retrofit.com.kodonho.android.rxandroid_basic09_retrofit.domain.Data;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by fastcampus on 2016-11-04.
 */


public interface IWeather {
    // http://api.openweathermap.org
    // /data/2.5/weather?q=Newyork&APPID=875ce2fc9b2fda06004fe0edcaba66a4
    @GET("/data/2.5/weather")
    Observable<Data> getData(@Query("q") String cityName, @Query("APPID") String key);
}
