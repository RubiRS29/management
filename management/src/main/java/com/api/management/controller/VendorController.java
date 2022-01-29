package com.api.management.controller;

import com.api.management.Dto.VendorDto;
import com.api.management.service.VendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorController {

    private final VendorService service;

    public VendorController(VendorService service) {
        this.service = service;
    }

    @GetMapping("/api/vendors")
    public List<VendorDto> getAllVendor(){
        return service.getAllVendors();
    }

    @GetMapping("/api/vendor/{id}")
    public VendorDto getVendor(@PathVariable String id){
        return service.getVendorBy(Long.parseLong(id));
    }

    @PostMapping("/api/vendor/save")
    public VendorDto saveVendor(@RequestBody VendorDto customer){
        return service.saveVendor(customer);
    }

    @DeleteMapping("/api/vendor/delete/{id}")
    public void deleteVendor(@PathVariable String id){
        service.deleteVendor(Long.parseLong(id));
    }
}
