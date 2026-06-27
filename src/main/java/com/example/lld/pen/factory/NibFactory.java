package com.example.lld.pen.factory;


import com.example.lld.pen.entities.Nib;

//Simple Factory for Creating Nib
public class NibFactory {

    public static Nib getNib(float radius){
        return new Nib(radius);
    }

}
