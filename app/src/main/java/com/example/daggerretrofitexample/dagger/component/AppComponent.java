package com.example.daggerretrofitexample.dagger.component;

import com.example.daggerretrofitexample.MainActivity;
import com.example.daggerretrofitexample.dagger.module.AppModule;
import com.example.daggerretrofitexample.dagger.module.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/16/21.
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
