package org.example.stok;

import org.example.item.Item;
import org.example.worker.Worker;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*;

public class Stok {
    private Map<Item, List<Item>> listItem = new HashMap<>();
    private Worker worker;

    public Stok(@Qualifier("zelya") Worker worker) {
        this.worker = worker;
    }
    public Map<Item, List<Item>> getListItem() {
        return listItem;
    }

    public Worker getWorker() {
        return worker;
    }

    public void takeItem(Item item, boolean isBroken ) {
        getListItem().get(item).removeIf(item1 -> item1.getIsBroken() == isBroken);
    }
}
