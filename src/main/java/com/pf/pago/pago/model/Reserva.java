package com.pf.pago.pago.model;

import lombok.Data;

import java.util.Date;

@Data
public class Reserva {

    private Integer id;

    private Boolean equipaje;

    private Boolean prioritario;

    private Date fechaReserva;

    private Integer costoReserva;

    private String numeroAsiento;

    private String estadoReserva;
    
    private Pasajero pasajero;

    private AgenciaViajes agenciaViajes;

    private Vuelo ida;

    private Vuelo vuelta;


}
