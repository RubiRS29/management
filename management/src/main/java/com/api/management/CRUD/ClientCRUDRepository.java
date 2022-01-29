package com.api.management.CRUD;

import com.api.management.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCRUDRepository extends JpaRepository<Client, Long> {

}