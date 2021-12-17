package com.example.daggerretrofitexample;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.daggerretrofitexample.Api.ApiService;
import com.example.daggerretrofitexample.data.SampleData;
import com.example.daggerretrofitexample.databinding.ActivityMainBinding;

import javax.inject.Inject;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/16/21.
 */

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private static final String TAG = "MainActivity";

    @Inject
    Retrofit retrofit;

    private ApiService todoApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        ((BaseApplication) getApplication()).getNetworkComponent().inject(this);
        todoApi = retrofit.create(ApiService.class);
        todoApi.getSampleData(1).enqueue(new Callback<SampleData>() {
            @Override
            public void onResponse(Call<SampleData> call, Response<SampleData> response) {
                Log.d(TAG, "onResponse: "+response.body().getTitle());
                binding.setData(response.body());
         }

            @Override
            public void onFailure(Call<SampleData> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });
    }

}
