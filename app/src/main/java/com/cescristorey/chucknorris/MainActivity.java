package com.cescristorey.chucknorris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cescristorey.chucknorris.api.ChuckNorrisService;
import com.cescristorey.chucknorris.databinding.ActivityMainBinding;
import com.cescristorey.chucknorris.modelos.Joke;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void loadJoke() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ChuckNorrisService.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ChuckNorrisService servicioChuckNorris = retrofit.create(ChuckNorrisService.class);

        Call<Joke> llamadaChuckNorris = servicioChuckNorris.getJoke();
        llamadaChuckNorris.enqueue(new Callback<Joke>() {
            @Override
            public void onResponse(Call<Joke> call, Response<Joke> response) {
                switch(response.code()) {
                    case 200:
                        break;
                    case 401:
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {

            }
        });
    }
}