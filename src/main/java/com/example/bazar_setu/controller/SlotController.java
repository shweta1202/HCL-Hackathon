package com.example.bazar_setu.controller;

import com.example.bazar_setu.model.Slot;
import com.example.bazar_setu.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/manageSlots")
public class SlotController {
    
    @Autowired
    private SlotRepository slotRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addSlot(@RequestBody Slot slot) {
        slotRepository.save(slot);
        return "Slot Added";
    }
}
