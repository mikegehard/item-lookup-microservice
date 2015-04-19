package com.github.mikegehard.itemLookup.domain;

public class ItemRepository {
    private String connectionInformation;

    public ItemRepository(String connectionInformation) {
        this.connectionInformation = connectionInformation;
    }

    public Item findById(int id) {
        return new Item(id);
    }
}
