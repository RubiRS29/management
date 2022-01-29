package com.api.management.Irepository;

import com.api.management.Dto.ClientDto;

import java.util.List;
import java.util.Optional;

public interface IClientRepository {

    List<ClientDto> getAllClients();
    Optional<ClientDto> getClientBy(Long id);
    Optional<ClientDto> saveClient(ClientDto client);
    void deleteClient(Long id);

}
