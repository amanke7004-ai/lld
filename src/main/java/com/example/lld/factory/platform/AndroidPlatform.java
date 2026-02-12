package com.example.lld.factory.platform;

import com.example.lld.factory.abstractFactory.AndroidUIComponentFactory;
import com.example.lld.factory.abstractFactory.UIComponentFactory;

public class AndroidPlatform implements Platform {

    //Here which UIComponentFactory Impl will be returned is directly linked with the fact
    //that what is the type of platform object  (android / ios)
    // so instead of creating a Simple Factory, Factory method.
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }

    // Not my job to return UI Components.
//    @Override
//    public Button getButton() {
//        return new AndroidButton();
//    }
//
//    @Override
//    public Menu getMenu() {
//        return new AndroidMenu();
//    }


}
