package com.example.lld.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/lld")
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<Map<String,String>> checkStatus(){
        return new ResponseEntity<>(Map.of("status", "OK"), HttpStatus.OK);
    }
}


