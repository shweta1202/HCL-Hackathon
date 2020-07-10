package com.example.bazar_setu.controller;

import com.example.bazar_setu.model.Consumer;
import com.example.bazar_setu.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/consumer")
public class ConsumerController {

    @Autowired
    private ConsumerRepository consumerRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addConsumer(@RequestParam String name, @RequestParam String contactNumber,
                                            @RequestParam String password, @RequestParam String location) {

        Consumer consumer = new Consumer();
        consumer.setName(name);
        consumer.setContactNumber(contactNumber);
        consumer.setPassword(password);
        consumer.setLocation(location);
        consumerRepository.save(consumer);
        return "Consumer Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Consumer> getAllConsumers() {
        return consumerRepository.findAll();
    }
}
