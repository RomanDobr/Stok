package org.example.importer;

import org.example.item.Item;
import org.example.stok.Stok;
import org.example.item.Vodka;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
public class AbsolutCreator {
    private int count;

    public List<Item> importItemsStok(Vodka vodka, Stok stok, int count) {
        List<Item> vodkaList = IntStream.range(0, count).mapToObj(i -> new Vodka()).collect(Collectors.toList());
        stok.getListItem().put(vodka, vodkaList);
        return vodkaList;
    }
}
