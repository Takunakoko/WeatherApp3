package com.example.takunaka.weatherapp.api;

import com.example.takunaka.weatherapp.dto.weatherDto.CurrentWeather;
import com.example.takunaka.weatherapp.dto.forecastDto.Forecast;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;


/**
 * Created by takunaka on 21.08.17.
 */

public interface WeatherApi {
    @GET("/data/2.5/weather")
    Observable<CurrentWeather> getWeather(@Query("q") String cityName, @Query("units") String units,
                                 @Query("appid") String appid);

    @GET("/data/2.5/forecast/daily")
    Observable<Forecast> getForecast(@Query("q") String cityName, @Query("units") String units,
                                     @Query("appid") String appid);

}
