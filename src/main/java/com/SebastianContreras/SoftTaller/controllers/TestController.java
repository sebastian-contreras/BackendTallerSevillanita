package com.SebastianContreras.SoftTaller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {
    @GetMapping("/get")
    public ResponseEntity<?> testGet() {
        return ResponseEntity.ok("GET OK");
    }
}
