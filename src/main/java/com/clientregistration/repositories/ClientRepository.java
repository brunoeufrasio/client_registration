package com.clientregistration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clientregistration.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
