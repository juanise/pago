package com.pf.pago.pago.model;

import lombok.Data;

import java.util.Date;

@Data
public class Vuelo {
    private Integer id;
    private Date fechaSalida;
    private Date fechaLlegada;
    private String tarjetaEmbarque;
    private Float tarifas;
    private String estadoVuelo;
    private Boolean tipoVuelo;

}
