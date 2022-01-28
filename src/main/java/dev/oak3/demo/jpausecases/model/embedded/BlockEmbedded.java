package dev.oak3.demo.jpausecases.model.embedded;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BlockEmbedded implements Serializable {

    @EmbeddedId
    private BlockEmbeddedId id;

    private long height;
}
