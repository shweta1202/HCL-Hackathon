package com.example.bazar_setu.controller;

import com.example.bazar_setu.entity.Shopkeeper;
import com.example.bazar_setu.entity.Slot;
import com.example.bazar_setu.repository.ShopkeeperRepository;
import com.example.bazar_setu.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/shopkeeper")
public class ShopkeeperController {

    @Autowired
    private ShopkeeperRepository shopkeeperRepository;
    @Autowired
    private SlotRepository slotRepository;


    @PostMapping(path = "/add")
    public @ResponseBody String addShopkeeper(@RequestBody Shopkeeper shopkeeper) {
        shopkeeper.setShopStatus(true);
        shopkeeperRepository.save(shopkeeper);
        return "Shopkeeper Saved";
    }

    @GetMapping(path = "/contactNumber")
    public @ResponseBody List<Shopkeeper> getShopkeeperByContactNumber(@RequestParam String contactNumber) {
        return shopkeeperRepository.findByContactNumber(contactNumber);
    }

    @PostMapping(path = "/changeStatus")
    public @ResponseBody String changeShopkeeperStatus(@RequestParam String contactNumber) {
        List<Shopkeeper> shopkeepers = shopkeeperRepository.findByContactNumber(contactNumber);
        Shopkeeper shopkeeper = shopkeepers.get(0);
        shopkeeper.setShopStatus(false);
        shopkeeperRepository.save(shopkeeper);
        return "Status Changed";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Shopkeeper> getAllShopkeeper() {
        return shopkeeperRepository.findAll();
    }

    @PostMapping(path = "/addSlot")
    public @ResponseBody String addSlot(@RequestBody Slot slot) {
        slotRepository.save(slot);
        return "Slot Added";
    }

    @GetMapping(path = "/history")
    public @ResponseBody List<Slot> getSlotsByContactNumber(@RequestParam String contactNumber) {
        return slotRepository.findByContactNumberOrderByDateDesc(contactNumber);
    }

}
