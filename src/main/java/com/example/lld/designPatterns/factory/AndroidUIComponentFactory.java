package com.example.lld.designPatterns.factory;

public class AndroidUIComponentFactory implements  UIComponentFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
