package com.pf.pago.pago.service;

import com.pf.pago.pago.config.RabbitConfig;
import com.pf.pago.pago.model.Reserva;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class RabbitListenerService {

    @Autowired
    private RabbitService rabbitService;

    @RabbitListener(queues = {RabbitConfig.COLA_PAGADO})
    public void informacionPagoRecibida (Reserva reserva){
        if (reserva != null){
            rabbitService.enviarPeticionPago(reserva);
        }
    }

}