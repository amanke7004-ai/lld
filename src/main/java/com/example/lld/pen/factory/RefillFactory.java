package com.example.lld.pen.factory;

import com.example.lld.pen.entities.Ink;
import com.example.lld.pen.entities.Nib;
import com.example.lld.pen.entities.Refill;

//Simple Factory for Refill
public class RefillFactory {

    public static Refill getRefill(Ink ink, Nib nib){
        return new Refill(ink, nib);
    }
}
