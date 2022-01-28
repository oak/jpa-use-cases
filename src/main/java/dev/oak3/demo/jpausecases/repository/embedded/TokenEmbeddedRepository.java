package dev.oak3.demo.jpausecases.repository.embedded;

import org.springframework.data.repository.CrudRepository;

import dev.oak3.demo.jpausecases.model.embedded.TokenEmbedded;

public interface TokenEmbeddedRepository extends CrudRepository<TokenEmbedded, String> {
}
