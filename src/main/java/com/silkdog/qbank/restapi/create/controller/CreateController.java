package com.silkdog.qbank.restapi.create.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("create")
public class CreateController {

    @GetMapping
    public String test(){
        return "";
    }

}
