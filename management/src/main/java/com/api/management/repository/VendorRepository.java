package com.api.management.repository;

import com.api.management.CRUD.VendorCRUDRepository;
import com.api.management.Dto.VendorDto;
import com.api.management.Irepository.IVendorRepository;
import com.api.management.entity.Vendor;
import com.api.management.mapper.VendorMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VendorRepository implements IVendorRepository {

    private final VendorCRUDRepository repository;
    private final VendorMapper mapper;

    public VendorRepository(VendorCRUDRepository repository, VendorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<VendorDto> getAllVendors() {
       return mapper.toVendorsDto(repository.findAll());
    }

    @Override
    public Optional<VendorDto> getVendorBy(Long id) {
        return repository.findById(id)
                .map(customer -> mapper.toVendorDto(customer));
    }

    @Override
    public Optional<VendorDto> saveVendor(VendorDto vendorDto) {
        Vendor vendor = mapper.toVendor(vendorDto);
        return Optional.of(mapper.toVendorDto(repository.save(vendor)));
    }

    @Override
    public void deleteVendor(Long id) {
        repository.deleteById(id);
    }
}
