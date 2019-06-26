package com.pf.pago.pago.service;

import com.pf.pago.pago.config.RabbitConfig;
import com.pf.pago.pago.model.Reserva;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitService.class);
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RabbitConfig rabbitConfig;

public void enviarPeticionPago(Reserva reserva){
        LOGGER.info("Reserva pagada");
        rabbitTemplate.convertAndSend(rabbitConfig.getPagoExchange(), "rk.pagado", reserva);
    }
}
