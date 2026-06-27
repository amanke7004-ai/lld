package com.example.lld.pen.entities;

import com.example.lld.pen.interfaces.Writable;
import com.example.lld.pen.enums.ClosingType;
import com.example.lld.pen.enums.PenType;



public abstract class Pen implements Writable {
    public Pen(String brand, String name, double price, PenType penType, ClosingType closingType) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.penType = penType;
        this.closingType = closingType;
    }

    public String brand;
    public String name;
    public double price;
    public PenType penType;
    public ClosingType closingType;

    public abstract void open();
    public abstract void close();
}
