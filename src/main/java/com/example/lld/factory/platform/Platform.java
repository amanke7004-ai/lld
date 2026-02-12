package com.example.lld.factory.platform;

import com.example.lld.factory.abstractFactory.UIComponentFactory;

public interface Platform {


    //abstract methods (not it's job to return Ui Component Objects.)


//    Button getButton();
//
//    Menu getMenu();

    //
    UIComponentFactory getUIComponentFactory();
}
