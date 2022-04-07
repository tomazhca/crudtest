package com.tomazhca.crudtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tomazhca.crudtest.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}