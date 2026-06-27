package com.example.lld.pen.factory;

import com.example.lld.pen.entities.Ink;
import com.example.lld.pen.enums.InkColor;

//Simple Factory for Creating  Ink
public class InkFactory {

    public static Ink getInk(InkColor inkColor){
        return new Ink(inkColor);
    }
}
