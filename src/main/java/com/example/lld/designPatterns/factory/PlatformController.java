package com.example.lld.designPatterns.factory;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PlatformController {

    private final PlatformService platformService;

    @GetMapping("/testPhone/{platformName}")
    public ResponseEntity<Map<String,String>> testPhone(@PathVariable("platformName") String platformName){
        platformService.testPhone(platformName);
        return new ResponseEntity<>(Map.of("status", "OK"),HttpStatus.OK);
    }
}
