package com.example.crud.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.crud.mongodb.entity.Pessoa;

public interface PessoaRepository extends MongoRepository<Pessoa, String>{

}
