package com.example.lld.factory.simpleFactory;

import com.example.lld.factory.platform.AndroidPlatform;
import com.example.lld.factory.platform.IosPlatform;
import com.example.lld.factory.platform.Platform;

public class PlatformFactory {

    //simple factory or factory method, which takes a parameter
    //based on the parameter type it returns an object.
    //All the if-else condition is present here, It does not breaks SRP (as
    // it's only responsibility is to return Various platform based on input parm).
    public static Platform getPlatformByName(String platformName){
        if(platformName.equalsIgnoreCase("ios")){
            return new IosPlatform();
        }else if(platformName.equalsIgnoreCase("android")){
            return new AndroidPlatform();
        }else{
            throw new RuntimeException("Platform not supported Exception");
        }
    }
}
