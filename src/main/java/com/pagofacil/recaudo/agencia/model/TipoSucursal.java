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
@Table(name = "tipo_sucursal")
public class TipoSucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
}
