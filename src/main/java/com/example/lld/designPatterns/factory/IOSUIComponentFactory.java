package com.example.lld.designPatterns.factory;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
