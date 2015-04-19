package com.github.mikegehard.itemLookup.domain;

import java.util.Random;

public class Item {
    final private Random random = new Random();
    private int id;

    public Item(int id) {
        this.id = id;
    }

    public long getPrice() {
        if (random.nextInt() % 2 == 0)
            return 100;
        else
            return 200;
    }
}
