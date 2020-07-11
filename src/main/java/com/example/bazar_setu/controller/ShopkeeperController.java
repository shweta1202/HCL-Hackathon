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
    public @ResponseBody String addShopkeeper(@RequestParam String name, @RequestParam String contactNumber,
                                              @RequestParam String location, @RequestParam String shopName,
                                              @RequestParam String shopType, @RequestParam String password,
                                              @RequestParam String shopImage) {

        Shopkeeper shopkeeper = new Shopkeeper();
        shopkeeper.setName(name);
        shopkeeper.setContactNumber(contactNumber);
        shopkeeper.setLocation(location);
        shopkeeper.setShopName(shopName);
        shopkeeper.setShopType(shopType);
        shopkeeper.setPassword(password);
        shopkeeper.setShopImage(shopImage);

        shopkeeperRepository.save(shopkeeper);
        return "Shopkeeper Saved";
    }

    @GetMapping(path = "/contactNumber")
    public @ResponseBody List<Shopkeeper> getShopkeeperByContactNumber(@RequestParam String contactNumber) {
        return shopkeeperRepository.findByContactNumber(contactNumber);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Shopkeeper> getAllShopkeeper() {
        return shopkeeperRepository.findAll();
    }

}
