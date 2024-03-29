package com.moriaty.controller;

import com.moriaty.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping(value = "/ribbon")
public class RibbonHandler {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
    }

    @GetMapping(value = "/index")
    public String index() {
        return restTemplate.getForObject("http://provider/student/index", String.class);
    }
}
