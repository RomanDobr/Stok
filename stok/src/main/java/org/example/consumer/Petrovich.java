package org.example.consumer;

import org.example.item.Vodka;
import org.example.stok.Stok;
import org.springframework.stereotype.Component;

@Component
public class Petrovich {

    public void takeItem(Stok stok, Vodka vodka) {
        stok.takeItem(vodka, true);
        System.out.println("Взял водку");
    }
}
