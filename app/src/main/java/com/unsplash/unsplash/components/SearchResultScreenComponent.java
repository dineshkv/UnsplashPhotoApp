package com.unsplash.unsplash.components;

import com.unsplash.unsplash.activities.MainActivity;
import com.unsplash.unsplash.components.CustomScope;
import com.unsplash.unsplash.components.NetComponent;
import com.unsplash.unsplash.modules.SearchResultScreenModule;

import dagger.Component;

@CustomScope
@Component(dependencies = NetComponent.class, modules = SearchResultScreenModule.class)
public interface SearchResultScreenComponent {
    void inject(MainActivity activity);
}
