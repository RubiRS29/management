package com.api.management.repository;

import com.api.management.CRUD.ClientCRUDRepository;
import com.api.management.Dto.ClientDto;
import com.api.management.Irepository.IClientRepository;
import com.api.management.entity.Client;
import com.api.management.mapper.ClientMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository implements IClientRepository {
    private final ClientCRUDRepository repository;
    private final ClientMapper mapper;

    public ClientRepository(ClientCRUDRepository repository, ClientMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ClientDto> getAllClients() {
        return mapper.toClientesDto(repository.findAll());
    }

    @Override
    public Optional<ClientDto> getClientBy(Long id) {
        return repository.findById(id)
                .map(client -> mapper.toClientDto(client));
    }

    @Override
    public Optional<ClientDto>saveClient(ClientDto clientDto) {
        Client client = mapper.toClient(clientDto);
        return Optional.of(mapper.toClientDto(repository.save(client)));
    }

    @Override
    public void deleteClient(Long id) {
        repository.deleteById(id);
    }
}
