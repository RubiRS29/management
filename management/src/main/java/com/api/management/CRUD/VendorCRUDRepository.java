package com.api.management.CRUD;

import com.api.management.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorCRUDRepository extends JpaRepository<Vendor, Long> {

}
