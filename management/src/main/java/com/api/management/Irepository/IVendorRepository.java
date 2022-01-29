package com.api.management.Irepository;

import com.api.management.Dto.VendorDto;

import java.util.List;
import java.util.Optional;

public interface IVendorRepository {
    List<VendorDto> getAllVendors();
    Optional<VendorDto> getVendorBy(Long id);
    Optional<VendorDto> saveVendor(VendorDto customer);
    void deleteVendor(Long id);
}
