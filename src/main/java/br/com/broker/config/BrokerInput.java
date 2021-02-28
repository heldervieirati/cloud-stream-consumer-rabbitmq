package br.com.broker.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface BrokerInput {
	
	String SUBSCRIBE_CUSTOMER = "subscribeCustomer";

	@Input(BrokerInput.SUBSCRIBE_CUSTOMER)
	SubscribableChannel subscribeCustomer();
	
}