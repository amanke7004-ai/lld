package com.example.lld.designPatterns.factory;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlatformService {

    private final PlatformFactory platformFactory;

    public void testPhone(String platformName){

        Platform platform = platformFactory.getPlatformByName(platformName);
        platform.boot();
        UIComponentFactory uiComponentFactory = platform.getUiComponentFactory();
        Button button = uiComponentFactory.createButton();
        button.clickButton();
        Menu menu = uiComponentFactory.createMenu();
        menu.showMenu();
    }

}
