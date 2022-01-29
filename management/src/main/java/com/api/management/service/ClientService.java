package com.api.management.service;

import com.api.management.Dto.ClientDto;
import com.api.management.Irepository.IClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final IClientRepository repository;

    public ClientService(com.api.management.Irepository.IClientRepository repository) {
        this.repository = repository;
    }


    public List<ClientDto> getAllClients() {
        return repository.getAllClients();
    }

    public ClientDto getClientBy(Long id) {
        return repository.getClientBy(id).orElse(null);
    }

    public ClientDto saveClient(ClientDto client) {
        return repository.saveClient(client).orElse(null);
    }

    public void deleteClient(Long id) {
        repository.deleteClient(id);
    }
}
