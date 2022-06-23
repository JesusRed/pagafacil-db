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
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private Long id;
    private String email;
    @ManyToOne
    @JoinColumn(name = "agencia_id")
    private Agencia agencia;
}
