package com.example.lld.designPatterns.factory;

public interface Platform {
    void boot();// internal methods

    //Factory Method
    UIComponentFactory getUiComponentFactory();
}
