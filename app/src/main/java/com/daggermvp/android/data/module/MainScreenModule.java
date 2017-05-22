package com.daggermvp.android.data.module;

import com.daggermvp.android.mainscreen.MainScreenContract;
import com.daggermvp.android.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by denabelarde on 24/04/2017.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}