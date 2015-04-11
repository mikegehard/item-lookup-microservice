package com.github.mikegehard.itemLookup.domain;

import java.util.Random;

public class Item {
    final private Random random = new Random();

    public long getPrice() {
        if (random.nextInt() % 2 == 0)
            return 100;
        else
            return 200;
    }
}
