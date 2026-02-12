package com.example.lld.factory.platform;

import com.example.lld.factory.abstractFactory.IOSUIComponentFactory;
import com.example.lld.factory.abstractFactory.UIComponentFactory;

public class IosPlatform implements Platform {

//    @Override
//    public Button getButton() {
//        return new IosButton();
//    }
//
//    @Override
//    public Menu getMenu() {
//        return new IosMenu();
//    }

    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
