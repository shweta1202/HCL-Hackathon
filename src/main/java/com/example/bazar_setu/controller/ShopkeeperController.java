package com.example.bazar_setu.controller;

import com.example.bazar_setu.model.Shopkeeper;
import com.example.bazar_setu.repository.ShopkeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/shopkeeper")
public class ShopkeeperController {

    @Autowired
    private ShopkeeperRepository shopkeeperRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addShopkeeper(@RequestBody Shopkeeper shopkeeper) {
        shopkeeperRepository.save(shopkeeper);
        return "Shopkeeper Saved";
    }

    @GetMapping(path = "/contactNumber")
    public @ResponseBody List<Shopkeeper> getShopkeeperByContactNumber(@RequestParam String contactNumber) {
        return shopkeeperRepository.findByContactNumber(contactNumber);
    }

    @PostMapping(path = "/changeStatus")
    public @ResponseBody String changeShopkeeperStatus(@RequestParam String contactNUmber) {
        List<Shopkeeper> shopkeepers = shopkeeperRepository.findByContactNumber(contactNUmber);
        Shopkeeper shopkeeper = shopkeepers.get(0);
        shopkeeper.setShopStatus(false);
        shopkeeperRepository.save(shopkeeper);
        return "Status Changed";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Shopkeeper> getAllShopkeeper() {
        return shopkeeperRepository.findAll();
    }

}
