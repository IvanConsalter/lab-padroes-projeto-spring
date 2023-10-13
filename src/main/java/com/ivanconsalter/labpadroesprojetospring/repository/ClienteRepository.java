package com.ivanconsalter.labpadroesprojetospring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivanconsalter.labpadroesprojetospring.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}
