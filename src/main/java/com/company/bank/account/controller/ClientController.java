package com.company.bank.account.controller;

import com.company.bank.account.model.ClientModel;
import com.company.bank.account.repository.ClientRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/cliente")
@OpenAPIDefinition(info = @Info(title = "Cliente Controller", version = "1.0", description = "CRUD Cliente"))
public class ClientController {

    private final ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ClientModel> salvar(@RequestBody ClientModel client) {
        ClientModel clientResponse = repository.save(client);
        return ResponseEntity.ok(clientResponse);
    }

    @GetMapping("/{code}")
    public ResponseEntity<ClientModel> searchByCode(@PathVariable Integer code) {
        Optional<ClientModel> client = repository.findById(code);

        if (client.isPresent()) {
            return ResponseEntity.ok(client.get());
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/buscaPorNome")
    public ResponseEntity<List<ClientModel>> searchByName(@RequestParam String name) {
        List<ClientModel> clients = repository.findByName(name);
        return ResponseEntity.ok(clients);
    }
}
