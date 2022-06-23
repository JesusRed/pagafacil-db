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
@Table(name = "estatus")
public class Estatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    private String color; // color type pending (could be hex)
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "detalle_orden_id")
    private DetalleOrden detalle_orden;
    @ManyToOne
    @JoinColumn(name = "recarga_id")
    private Recarga recarga;
}
