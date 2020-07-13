package com.example.bazar_setu.controller;

import com.example.bazar_setu.model.Consumer;
import com.example.bazar_setu.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerRepository consumerRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addConsumer(@RequestBody Consumer consumer) {
        consumerRepository.save(consumer);
        return "Consumer Saved";
    }

    @GetMapping(path = "/contactNumber")
    public @ResponseBody List<Consumer> getConsumerByContactNUmber(@RequestParam String contactNumber) {
        return consumerRepository.findByContactNumber(contactNumber);
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Consumer> getAllConsumers() {
        return consumerRepository.findAll();
    }
}
