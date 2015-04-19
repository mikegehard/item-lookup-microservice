package com.github.mikegehard.itemLookup.web;

import com.github.mikegehard.itemLookup.domain.Item;
import com.github.mikegehard.itemLookup.domain.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ItemLookupApplication {

    private ItemRepository repo;

    public ItemLookupApplication(){
        String connectionString = "some connection string";
        this.repo = new ItemRepository(connectionString);
    }

    public static void main(String[] args) {
        SpringApplication.run(ItemLookupApplication.class, args);
    }


    @RequestMapping("/item/{id}")
    public Item getItem(@PathVariable int id){
        return repo.findById(id);
    }
}
