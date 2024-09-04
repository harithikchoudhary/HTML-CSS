package com.iiht.store.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.store.entity.Egg;
import com.iiht.store.service.StoreService;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping("/all-items")
    public Map<String, Object> getAllItems() {
        return storeService.getAllItems();
    }

    // CRUD endpoints for Egg
    @PostMapping("/eggs")
    public Egg addEgg(@RequestBody Egg egg) {
        return storeService.addEgg(egg);
    }

    @GetMapping("/eggs")
    public List<Egg> getAllEggs() {
        return storeService.getAllEggs();
    }
}


