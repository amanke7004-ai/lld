package com.example.lld.pen.factory;


import com.example.lld.pen.entities.Ink;
import com.example.lld.pen.entities.Nib;
import com.example.lld.pen.entities.Pen;
import com.example.lld.pen.entities.Refill;
import com.example.lld.pen.enums.ClosingType;
import com.example.lld.pen.enums.PenType;
import com.example.lld.pen.penTypes.BallPen;
import com.example.lld.pen.penTypes.FountainPen;
import com.example.lld.pen.penTypes.GelPen;

//Simple Factory for Creating Pen
public class PenFactory {

    public static Pen getFountainPen(String name, String brand, double price, Ink ink, Nib nib) {
        return new FountainPen(ink, nib, name, brand, price);
    }

    public static Pen getRefillablePen(String name, String brand, double price, Refill refill, PenType penType, ClosingType closingType) {
        if (PenType.GEL_PEN.equals(penType)) {
            return new GelPen(name, brand, price, refill, closingType);
        }
        return new BallPen(name, brand, price, refill, closingType);
    }
}
