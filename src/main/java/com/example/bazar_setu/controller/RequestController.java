package com.example.bazar_setu.controller;

import com.example.bazar_setu.model.Request;
import com.example.bazar_setu.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/manageRequest")
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addRequest(@RequestBody Request request) {
        requestRepository.save(request);
        return "Request added";
    }
}
