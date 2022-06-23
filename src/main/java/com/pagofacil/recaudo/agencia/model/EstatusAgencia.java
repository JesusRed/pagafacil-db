package com.pagofacil.recaudo.agencia.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Accessors(chain = true)
@Table(name = "estatus_agencia")
public class EstatusAgencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    private Date fecha_status; // DATE FORMAT PENDING
    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;
    @ManyToOne
    @JoinColumn(name = "estatus_id")
    private Estatus estatus;
}
