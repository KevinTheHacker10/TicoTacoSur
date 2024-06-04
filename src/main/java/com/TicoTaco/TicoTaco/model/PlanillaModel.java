package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "PLANILLA")
public class PlanillaModel {

    @Id
    @Column(name = "C_PLANILLA")
    private long planillaId;

    @Column(name = "C_HORAS_EXTRAS")
    private int horasextras;

    @Column(name = "M_SALARIO_TOTAL")
    private int salariototal;

    @Column(name = "M_SALARIO_BASE")
    private int salariobase;

    @Column(name = "F_FECHA_PAGO")
    private Date fechapago;

    @JoinColumn (name = "C_DEDUCCION", nullable = false)
    private DeduccionesModel deduccionId;

    @Column(name = "C_BONIFICACION")
    private long bonificacion;

    @OneToMany(mappedBy = "planillaId")
    private List<AdminRestauranteModel> adminRestaurantes;
}
