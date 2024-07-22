package com.proyectos.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api")
public class hello {
	
	@Operation(summary = "Obtener mensaje", description = "Obtiene un mensaje de ejemplo.")
    @ApiResponse(responseCode = "200", description = "Mensaje obtenido con éxito")
    @GetMapping("/hello")
    public String getMessage() {
        return "Hola, Mundo!";
    }
}

