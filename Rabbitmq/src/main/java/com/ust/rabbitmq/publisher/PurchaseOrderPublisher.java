package com.ust.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rabbitmq.model.OrderStatus;
import com.ust.rabbitmq.model.PurchaseOrder;


@RestController
@RequestMapping("/order")
public class PurchaseOrderPublisher {
	
	
	@Autowired
	private RabbitTemplate temp;
	
	@Value("${ust.rabbitmq.queue}")
	String queuename;
	
	@Value("${ust.rabbitmq.exchange}")
	String exchange;
	
	@Value("${ust.rabbitmq.routingkey}")
	String routingkey;
	
	
	@PostMapping("/{customerName}")
	public String bookOrder(@RequestBody PurchaseOrder order, @PathVariable String customerName) {
		
		order.setOrderId(UUID.randomUUID().toString());
		
		OrderStatus orderstatus =new OrderStatus(order, "ACCEPTED", "Order place successfulyy by "+customerName);
		temp.convertAndSend(exchange, routingkey, orderstatus);
		return "Success";
	}

}
