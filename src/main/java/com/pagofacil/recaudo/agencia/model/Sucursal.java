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
@Table(name = "sucursales")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;
    @ManyToOne
    @JoinColumn(name = "tipo_sucursal_id")
    private TipoSucursal tipo_sucursal;
}
