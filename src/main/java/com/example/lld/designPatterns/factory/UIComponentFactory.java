package com.example.lld.designPatterns.factory;


//Abstract Factory
public interface UIComponentFactory {

    Button createButton();

    Menu createMenu();
}
