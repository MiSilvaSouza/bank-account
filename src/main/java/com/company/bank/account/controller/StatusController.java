package com.company.bank.account.controller;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@OpenAPIDefinition(info = @Info(title = "Treinamento 2021", version = "1.0", description = "Treinamento Java com Spring Boot + Angular"))
public class StatusController {

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Sucesso!");
    }
}
