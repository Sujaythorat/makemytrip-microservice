package com.example.makemytrip_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hotel {   @GetMapping ("/Hotel")
public String getData () { return "Please book your Hotel tickets at 25% discount";
}}
