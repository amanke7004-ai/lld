package com.example.lld.designPatterns.factory;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class PlatformFactory {


    private final Map<String, Platform> platformMap;


    // simple factory
    public Platform getPlatformByName(String name){
        return platformMap.get(name);
    }

}
