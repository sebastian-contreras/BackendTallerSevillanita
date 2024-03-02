package com.SebastianContreras.SoftTaller.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public ResponseEntity<?> testGet() {
        return ResponseEntity.ok("GET OK");
    }
}
