package com.moriaty.controller;

import com.moriaty.entity.Student;
import com.moriaty.fegin.FeginProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = "/fegin")
public class FeginHandler {

    @Autowired
    private FeginProviderClient feginProviderClient;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return feginProviderClient.findAll();
    }

    @GetMapping(value = "/index")
    public String index(){
        return feginProviderClient.index();
    }
}
