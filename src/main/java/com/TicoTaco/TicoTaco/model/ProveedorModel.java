package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "PROVEEDORES")
public class ProveedorModel {

    @Id
    @Column(name = "C_PROVEEDOR")
    private long proveedorId;

    @Column(name = "D_NOMBRE_PROVEEDOR")
    private String nombreProveedor;

    @Column(name = "F_DIAS_ENTREGA")
    private Date diasentrega;

    @Column(name = "C_DIRECCION")
    private int direccion;

    @Column(name = "C_CONTACTO")
    private long contactoId;
}

