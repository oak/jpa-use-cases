package dev.oak3.demo.jpausecases.repository;

import org.springframework.data.repository.CrudRepository;

import dev.oak3.demo.jpausecases.model.Token;

public interface TokenRepository extends CrudRepository<Token, String> {
    
}
