package com.pf.pago.pago.model;

import lombok.Data;

@Data

public class Pasajero {
    
    private Integer id;
    private String dniPassaporte;
    private String name;
    private String apellidoPaterno;
    private String apellidoMaterno;
}