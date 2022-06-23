package com.pagofacil.recaudo.agencia.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "tipo_agen_hist")
public class TipoAgenciaHistoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "tipo_agencia_id")
    private TipoAgencia tipo_agencia;
    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;
}
