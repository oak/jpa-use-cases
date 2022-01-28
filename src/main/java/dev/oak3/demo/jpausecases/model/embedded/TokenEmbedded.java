package dev.oak3.demo.jpausecases.model.embedded;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TokenEmbedded implements Serializable {

    @Id
    private String symbol;

    private String name;
}
