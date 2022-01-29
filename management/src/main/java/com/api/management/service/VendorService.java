package com.api.management.service;

import com.api.management.Dto.VendorDto;
import com.api.management.Irepository.IVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    private final IVendorRepository repository;

    public VendorService(IVendorRepository repository) {
        this.repository = repository;
    }

    public List<VendorDto> getAllVendors(){
        return repository.getAllVendors();
    }

    public VendorDto getVendorBy(Long id) {
        return repository.getVendorBy(id).orElse(null);
    }

    public VendorDto saveVendor(VendorDto customer) {
       return repository.saveVendor(customer).orElse(null);
    }

    public void deleteVendor(Long id) {
        repository.deleteVendor(id);
    }

}
