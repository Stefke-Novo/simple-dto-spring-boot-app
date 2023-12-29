package com.exercise.dto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/example")
public class ExampleController {

    @GetMapping
    public ResponseEntity<List<String>> returnListExample(){
        return ResponseEntity.ok(new ArrayList<String>(Arrays.asList("Mika","Zika")));
    }
}
