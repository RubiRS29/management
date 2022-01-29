package com.api.management.mapper;

import com.api.management.Dto.ClientDto;
import com.api.management.Dto.EmployeeDto;
import com.api.management.entity.Client;
import com.api.management.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    @Mapping(target="id", source="id")
    @Mapping(target="firstName", source="firstName")
    @Mapping(target="email", source="email")
    @Mapping(target="phone", source="phone")
    @Mapping(target="address", source="address")
    @Mapping(target="web", source="web")
    @Mapping(target="contact", source="contact")
    ClientDto toClientDto(Client client);

    List<ClientDto> toClientesDto(List<Client> clientDto);

    @InheritInverseConfiguration
    Client toClient(ClientDto client);

}
