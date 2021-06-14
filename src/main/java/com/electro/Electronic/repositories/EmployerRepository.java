package com.electro.Electronic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.electro.Electronic.models.Employer;

public interface EmployerRepository extends JpaRepository<Employer,Long> {

}
