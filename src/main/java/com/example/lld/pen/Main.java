package com.example.lld.pen;

import com.example.lld.pen.entities.Ink;
import com.example.lld.pen.entities.Nib;
import com.example.lld.pen.entities.Pen;
import com.example.lld.pen.entities.Refill;
import com.example.lld.pen.enums.ClosingType;
import com.example.lld.pen.enums.InkColor;
import com.example.lld.pen.enums.PenType;
import com.example.lld.pen.factory.InkFactory;
import com.example.lld.pen.factory.NibFactory;
import com.example.lld.pen.factory.PenFactory;

import java.sql.Ref;

public class Main {
    public static void main(String[] args) {
        Nib nib = NibFactory.getNib(0.2f);
        Ink blueInk = InkFactory.getInk(InkColor.BLUE);
        Ink blackInk = InkFactory.getInk(InkColor.BLACK);

        Refill blueRefill = new Refill(blueInk, nib);
        Refill blackRefill = new Refill(blackInk, nib);

        Pen blackFountainPen = PenFactory.getFountainPen("writingKing", "Luxor", 250.0f, blackInk, nib);
        blackFountainPen.write();
        blackFountainPen.close();

        System.out.println("========================================================\n\n\n\n\n");

        Pen blueGellPen = PenFactory.getRefillablePen("butterflow", "Renoylds",  20.0f, blueRefill,  PenType.GEL_PEN, ClosingType.CAP);
        blueGellPen.write();
        blueGellPen.close();
        System.out.println("========================================================\n\n\n\n\n");


        Pen clickableBlackBallPen = PenFactory.getRefillablePen("superBlack", "Linc", 30.0f, blackRefill, PenType.BALL_PEN, ClosingType.CLICK);
        clickableBlackBallPen.write();
        clickableBlackBallPen.close();



    }
}
