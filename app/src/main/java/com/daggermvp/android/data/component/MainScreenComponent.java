package com.daggermvp.android.data.component;

import com.daggermvp.android.data.module.MainScreenModule;
import com.daggermvp.android.mainscreen.MainActivity;
import com.daggermvp.android.util.CustomScope;

import dagger.Component;

/**
 * Created by denabelarde on 24/04/2017.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}