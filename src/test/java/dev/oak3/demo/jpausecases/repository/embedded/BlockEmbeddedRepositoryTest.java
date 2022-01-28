package dev.oak3.demo.jpausecases.repository.embedded;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.oak3.demo.jpausecases.model.embedded.BlockEmbedded;
import dev.oak3.demo.jpausecases.model.embedded.BlockEmbeddedId;
import dev.oak3.demo.jpausecases.model.embedded.TokenEmbedded;

@SpringBootTest
public class BlockEmbeddedRepositoryTest {
    private final static Logger LOGGER = LoggerFactory.getLogger(BlockEmbeddedRepositoryTest.class);

    @Autowired
    private BlockEmbeddedRepository blockRepository;

    @Autowired
    private TokenEmbeddedRepository tokenRepository;

    @Test
    void persist() {
        LOGGER.info("will persist");

        TokenEmbedded token = TokenEmbedded.builder().symbol("symbol").name("name").build();

        assertDoesNotThrow(() -> tokenRepository.save(token));

        BlockEmbedded block = BlockEmbedded.builder()
                .id(BlockEmbeddedId.builder().hash("hash").token(token).build()).build();

        assertDoesNotThrow(() -> blockRepository.save(block));
    }

}
