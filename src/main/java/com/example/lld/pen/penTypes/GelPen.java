package com.example.lld.pen.penTypes;

import com.example.lld.pen.enums.ClosingType;
import com.example.lld.pen.entities.Pen;
import com.example.lld.pen.entities.Refill;
import com.example.lld.pen.interfaces.Refillable;
import com.example.lld.pen.enums.PenType;

public class GelPen extends Pen implements Refillable {

    private Refill refill;

    private ClosingType closingType;

    public GelPen(String name, String brand, double price, Refill refill, ClosingType closingType){
        super(brand, name, price, PenType.GEL_PEN, closingType);
        this.refill = refill;
        this.closingType = closingType;
    }

    @Override
    public void open() {
        System.out.println("opening gel pen via : " + closingType);
    }

    @Override
    public void close() {
        System.out.println("closing gel pen via : " + closingType);

    }

    @Override
    public void write() {
        System.out.println("Writing with Gel Pen with details :: \nBrand : " + this.brand  + "\nColor : " + this.refill.getInk().getInkColor() + "\nPenType: " + this.penType + "\nPen Price: " + this.price);
    }

    @Override
    public void refill(Refill refill) {
        System.out.println("Refilling Gel Pen with new Refill of color : " + refill.getInk().getInkColor());
    }
}
