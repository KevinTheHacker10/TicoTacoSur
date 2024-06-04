package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
    
    @Column(name = "F_FECHA_PAGO")
    private Date fechapago;

    @Column(name = "C_DEDUCCION")
    private long deduccionId;

    @Column(name = "C_BONIFICACION")
    private long bonificacionId;

}
