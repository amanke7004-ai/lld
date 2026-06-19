package com.example.lld.designPatterns.factory;

public class IOSMenu implements Menu{

    @Override
    public void showMenu() {
        System.out.println("Showing IOS Menu");
    }
}
