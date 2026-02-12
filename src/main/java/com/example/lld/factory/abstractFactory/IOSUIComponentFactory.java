package com.example.lld.factory.abstractFactory;

import com.example.lld.factory.buttons.Button;
import com.example.lld.factory.buttons.IosButton;
import com.example.lld.factory.menu.IosMenu;
import com.example.lld.factory.menu.Menu;

//Acting as factory for multiple UI Components (Buttons, Menu etc).
//So the name is Abstract Factory.
public class IOSUIComponentFactory implements UIComponentFactory {
    @Override
    public Button getButton() {
        return new IosButton();
    }

    @Override
    public Menu getMenu() {
        return new IosMenu();
    }
}
