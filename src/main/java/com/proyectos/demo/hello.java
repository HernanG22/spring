package com.proyectos.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class hello {

    @GetMapping("/hello")
    public String getMessage() {
        return "Hola, Mundo!";
    }
}

