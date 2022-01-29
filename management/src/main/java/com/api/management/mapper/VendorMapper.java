package com.api.management.mapper;

import com.api.management.Dto.VendorDto;
import com.api.management.entity.Vendor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    @Mapping(target="id", source="id")
    @Mapping(target="firstName", source="firstName")
    @Mapping(target="email", source="email")
    @Mapping(target="phone", source="phone")
    @Mapping(target="address", source="address")
    VendorDto toVendorDto(Vendor client);

    List<VendorDto> toVendorsDto(List<Vendor> client);

    @InheritInverseConfiguration
    Vendor toVendor(VendorDto vendorDto);

}
