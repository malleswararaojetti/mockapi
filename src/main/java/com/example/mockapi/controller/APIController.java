package com.example.mockapi.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1")
public class APIController{

    @GetMapping("/data")
    public List<Data> getData(){
        return Arrays.asList(
                new Data(1, "data1", "Ten"),
                new Data(2, "data2", "Ten"),
                new Data(3, "data3", "Ten")
        );
    }
}
