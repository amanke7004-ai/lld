package com.example.lld.pen.penTypes;

import com.example.lld.pen.enums.ClosingType;
import com.example.lld.pen.entities.Ink;
import com.example.lld.pen.entities.Nib;
import com.example.lld.pen.entities.Pen;
import com.example.lld.pen.enums.PenType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter

public class FountainPen extends Pen {

    private Ink ink;

    private Nib nib;

    public FountainPen(Ink ink,  Nib nib, String name, String brand, double price){
        super(name, brand, price, PenType.FOUNTAIN_PEN, ClosingType.CAP);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void open() {
        System.out.println("opening fountainpen via : " + closingType);
    }

    @Override
    public void close() {
        System.out.println("closing Fountain Pen via : " + closingType);

    }

    @Override
    public void write() {
        System.out.println("Writing with Fountain Pen with details :: \nBrand : " + this.brand  + "\nColor : " + this.getInk().getInkColor() + "\nPenType: " + this.penType + "\nPen Price: " + this.price);
    }
}
