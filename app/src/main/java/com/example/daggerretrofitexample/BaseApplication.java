package com.example.daggerretrofitexample;

import android.app.Application;

import com.example.daggerretrofitexample.dagger.component.AppComponent;
import com.example.daggerretrofitexample.dagger.component.DaggerAppComponent;
import com.example.daggerretrofitexample.dagger.module.AppModule;
import com.example.daggerretrofitexample.dagger.module.NetworkModule;

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/16/21.
 */

public class BaseApplication extends Application {
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule("https://jsonplaceholder.typicode.com"))
                .build();
    }

    public AppComponent getNetworkComponent() {
        return appComponent;
    }
}
