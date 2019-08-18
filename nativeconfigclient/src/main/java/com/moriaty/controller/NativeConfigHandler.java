package com.moriaty.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/native")
public class NativeConfigHandler {

    @Value(value = "${server.port}")
    public String port;

    @Value(value = "${foo}")
    public String foo;

    @GetMapping(value = "/index")
    public String index(){
        return this.port + "-" + this.foo;
    }
}
