package com.example.makemytrip_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {   @GetMapping ("/Flight")
    public String getData () { return "Please book your flight tickets at 20% discount";
}}