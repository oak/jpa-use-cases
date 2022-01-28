package dev.oak3.demo.jpausecases.model.embedded;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class BlockEmbeddedId implements Serializable {

    private String hash;

    @MapsId("symbol")
    @ManyToOne(fetch = FetchType.LAZY)
    private TokenEmbedded token;
}
