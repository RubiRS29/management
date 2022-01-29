package com.api.management.controller;

import com.api.management.Dto.ClientDto;
import com.api.management.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }
    @GetMapping("/api/clients")
    public List<ClientDto> getAllCustomer(){
        return service.getAllClients();
    }

    @GetMapping("/api/clients/{id}")
    public ClientDto getCustomer(@PathVariable String id){
        return service.getClientBy(Long.parseLong(id));
    }

    @PostMapping("/api/clients/save")
    public ClientDto saveCustomer(@RequestBody ClientDto client){
        return service.saveClient(client);
    }

    @DeleteMapping("/api/clients/delete/{id}")
    public void deleteCustomer(@PathVariable String id){
        service.deleteClient(Long.parseLong(id));
    }
}
