package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "DIRECCION")
public class DireccionModel {

    @Id
    @Column(name = "C_DIRECCION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long direccionId;

    @Column(name = "D_DIRECCION_ESPECIFICA")
    private String direccionEspecifica;

    @Column(name = "C_DISTRITO")
    private int distritoId;
}
