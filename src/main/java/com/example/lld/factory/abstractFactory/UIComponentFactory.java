package com.example.lld.factory.abstractFactory;


import com.example.lld.factory.buttons.Button;
import com.example.lld.factory.menu.Menu;

//It's job is to return UI Components
//Why it's abstract factory, because it returns multiple Objects on basis of the impl of this interface
//if android is implementing it, then it will return Button of type AndroidButton, and Menu of type Android Menu
public interface UIComponentFactory {

    Button getButton();

    Menu getMenu();


}
