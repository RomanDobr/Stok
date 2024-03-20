package org.example.consumer;

import org.example.item.Bike;
import org.example.stok.Stok;
import org.springframework.stereotype.Component;

@Component
public class Reshar {

    public void takeItem(Stok stok, Bike bike) {
        stok.takeItem(bike, false);
        System.out.println("Взял велосипед");
    }
}
