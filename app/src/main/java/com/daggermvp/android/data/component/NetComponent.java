package com.daggermvp.android.data.component;

import android.content.SharedPreferences;

import com.daggermvp.android.data.module.AppModule;
import com.daggermvp.android.data.module.NetModule;
import com.daggermvp.android.mainscreen.MainActivity;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by denabelarde on 24/04/2017.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
    SharedPreferences sharedPreferences();
    OkHttpClient okHttp();
}

