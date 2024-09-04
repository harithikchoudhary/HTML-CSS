package com.iiht.store.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.store.entity.Egg;
import com.iiht.store.entity.repository.AppleRepository;
import com.iiht.store.entity.repository.BreadRepository;
import com.iiht.store.entity.repository.ChocolateRepository;
import com.iiht.store.entity.repository.EggRepository;
import com.iiht.store.entity.repository.MilkRepository;

@Service
public class StoreService {

    @Autowired
    private EggRepository eggRepository;

    @Autowired
    private MilkRepository milkRepository;

    @Autowired
    private ChocolateRepository chocolateRepository;

    @Autowired
    private AppleRepository appleRepository;

    @Autowired
    private BreadRepository breadRepository;

    public Map<String, Object> getAllItems() {
        Map<String, Object> storeItems = new HashMap<>();

        storeItems.put("Eggs", eggRepository.findAll());
        storeItems.put("Milk", milkRepository.findAll());
        storeItems.put("Chocolates", chocolateRepository.findAll());
        storeItems.put("Apples", appleRepository.findAll());
        storeItems.put("Bread", breadRepository.findAll());

        return storeItems;
    }

    // CRUD operations for Egg
    public Egg addEgg(Egg egg) {
        return eggRepository.save(egg);
    }

    public List<Egg> getAllEggs() {
        return eggRepository.findAll();
    }
}

   