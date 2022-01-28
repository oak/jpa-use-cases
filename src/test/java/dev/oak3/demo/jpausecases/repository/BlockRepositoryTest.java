package dev.oak3.demo.jpausecases.repository;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.oak3.demo.jpausecases.model.Block;
import dev.oak3.demo.jpausecases.model.Token;

@SpringBootTest
public class BlockRepositoryTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(BlockRepositoryTest.class);

    @Autowired
    private BlockRepository blockRepository;

    @Autowired
    private TokenRepository tokenRepository;

    @Test
    void persist() {
        LOGGER.info("will persist");

        Token token = Token.builder().symbol("symbol").name("name").build();

        assertDoesNotThrow(() -> tokenRepository.save(token));

        Block block = Block.builder().hash("hash").token(token).build();

        assertDoesNotThrow(() -> blockRepository.save(block));
    }
}
