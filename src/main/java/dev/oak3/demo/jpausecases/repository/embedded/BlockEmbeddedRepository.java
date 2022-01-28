package dev.oak3.demo.jpausecases.repository.embedded;

import org.springframework.data.repository.CrudRepository;

import dev.oak3.demo.jpausecases.model.embedded.BlockEmbedded;
import dev.oak3.demo.jpausecases.model.embedded.BlockEmbeddedId;

public interface BlockEmbeddedRepository extends CrudRepository<BlockEmbedded, BlockEmbeddedId> {
}
