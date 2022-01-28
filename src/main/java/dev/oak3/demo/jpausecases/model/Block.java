package dev.oak3.demo.jpausecases.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@Entity
@IdClass(BlockId.class)
public class Block implements Serializable {

    @Id
    private String hash;

    @Id
    @MapsId("symbol")
    @ManyToOne(fetch = FetchType.LAZY)
    private Token token;

    private long height;
}
