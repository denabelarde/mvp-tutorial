package com.daggermvp.android.mainscreen;

import android.app.Application;

import com.daggermvp.android.data.component.DaggerNetComponent;
import com.daggermvp.android.data.component.NetComponent;
import com.daggermvp.android.data.module.AppModule;
import com.daggermvp.android.data.module.NetModule;

/**
 * Created by denabelarde on 24/04/2017.
 */
public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}