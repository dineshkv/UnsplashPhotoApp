package com.unsplash.unsplash.activities;

import android.app.Application;

import com.unsplash.unsplash.components.DaggerNetComponent;
import com.unsplash.unsplash.components.NetComponent;
import com.unsplash.unsplash.modules.AppModule;
import com.unsplash.unsplash.modules.NetModule;

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder().appModule(new AppModule(this)).
                netModule(new NetModule("https://api.unsplash.com/")).build();

    }

    public NetComponent getmNetComponent() {
        return mNetComponent;
    }
}
