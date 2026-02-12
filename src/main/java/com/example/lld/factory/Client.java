package com.example.lld.factory;

import com.example.lld.factory.abstractFactory.UIComponentFactory;
import com.example.lld.factory.buttons.Button;
import com.example.lld.factory.menu.Menu;
import com.example.lld.factory.platform.Platform;
import com.example.lld.factory.simpleFactory.PlatformFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Enter your platform");
        Scanner sc = new Scanner(System.in);
        //Simple Factory
        Platform platform = PlatformFactory.getPlatformByName(sc.nextLine());

//        UIComponentFactory uiComponentFactory = null;
//        again don't use if-else, instead create a factory method.
//        if(platform instanceof AndroidPlatform){
//            uiComponentFactory = new AndroidUIComponentFactory();
//        }

        //Factory method to get Abstract Factory (returns Factory of factory)
        UIComponentFactory uiComponentFactory = platform.getUIComponentFactory();

        Button button = uiComponentFactory.getButton();
        button.click();

        Menu menu = uiComponentFactory.getMenu();
        menu.showMenu();



        //Similarly we can have another example for :
        /*
        Platform = Database
        AndroidPlatform = SQLDatabase
        IOSPlatform = MongoDatabase

        Button = Query,
        Menu = Transaction,
        UIComponentFactory = DBUtilsFactory
        AndroidUIComponentFactory = SQLDatabaseUtilsFactory
        IOSUIComponentFactory = MongoDatabaseUtilsFactory


        //SimpleFactory = "name" based DB Objects (SQLDatabase / MongoDatabase).
        PlatformFactory.getPlatformByName(name);
        Database database = DatabaseFactory.getDatabaseByName(name);

       //Factory Method in Database & Impl classes
         platform.getUIComponentFactory();

         DBUtilsFactory dbUtilsFactory  = database.getDBUtilsFactory();

         Query query = dbUtilsFactory.getQuery();
         Transaction transaction = dbUtilsFactory.getTransaction();









         */
    }
}
