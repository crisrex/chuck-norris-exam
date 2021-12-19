package com.cescristorey.chucknorris.api;

import com.cescristorey.chucknorris.modelos.Joke;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ChuckNorrisService {

    static final String URL = "https://api.chucknorris.io/";

    @GET("xxxxx")
    public Call<Joke> getJoke();

}
