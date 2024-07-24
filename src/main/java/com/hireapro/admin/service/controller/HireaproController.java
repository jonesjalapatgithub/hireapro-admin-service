package com.hireapro.admin.service.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HireaproController {

    @GetMapping("/authenticate")
    public ResponseEntity<String> authenticatedEndPoint(String zvalue) {
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloworld() {
        return ResponseEntity.ok("Hello World");
    }


}
