package dev.oak3.demo.jpausecases.repository;

import org.springframework.data.repository.CrudRepository;

import dev.oak3.demo.jpausecases.model.Block;
import dev.oak3.demo.jpausecases.model.BlockId;

public interface BlockRepository extends CrudRepository<Block, BlockId> {
    
}
