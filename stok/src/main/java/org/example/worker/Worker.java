package org.example.worker;

import org.example.item.Item;
import org.example.stok.Stok;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class Worker {
    private String name;

    public Worker(@Qualifier("zelya")String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void takeItem() {
        System.out.println("Товар принят");
    }

    public void brokenItem(List<Item> list) {
        takeItem();
        list.get(1).setBroken(true);
        System.out.println("Товар испорчен");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }
}
