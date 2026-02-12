package com.example.lld.factory.abstractFactory;

import com.example.lld.factory.buttons.AndroidButton;
import com.example.lld.factory.buttons.Button;
import com.example.lld.factory.menu.AndroidMenu;
import com.example.lld.factory.menu.Menu;

public class AndroidUIComponentFactory  implements UIComponentFactory {
    @Override
    public Button getButton() {
        return new AndroidButton();
    }

    @Override
    public Menu getMenu() {
        return new AndroidMenu();
    }
}
