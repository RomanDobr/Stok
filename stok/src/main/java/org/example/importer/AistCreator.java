package org.example.importer;

import org.example.item.Item;
import org.example.stok.Stok;
import org.example.item.Bike;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class AistCreator {
    private int count;

    public List<Item> importItemsStok(Bike bike, Stok stok, int count) {
        List<Item> bikeList = IntStream.range(0, count).mapToObj(i -> new Bike()).collect(Collectors.toList());
        stok.getListItem().put(bike, bikeList);
        return bikeList;
    }
}
