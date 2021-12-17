package com.example.daggerretrofitexample.dagger.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/16/21.
 */

@Module
public class AppModule {
    private Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
