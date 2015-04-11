package com.github.mikegehard.itemLookup.web;

import com.github.mikegehard.itemLookup.domain.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ItemLookupApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemLookupApplication.class, args);
    }

    @RequestMapping("/")
    public Item home(){
        return new Item();
    }
}
