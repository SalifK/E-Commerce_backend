package com.electro.Electronic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.Electronic.models.Client;

public interface ClientRepository extends JpaRepository<Client,Long>{

}
