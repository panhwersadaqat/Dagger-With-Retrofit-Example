package com.example.daggerretrofitexample.Api;

import com.example.daggerretrofitexample.data.SampleData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/16/21.
 */

public interface ApiService {
    @GET("/todos/{id}")
    Call<SampleData> getSampleData(
            @Path("id") int id
    );
}
