package br.com.broker.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.broker.bean.Customer;
import br.com.broker.config.BrokerInput;

@Service
@Transactional
@EnableBinding(BrokerInput.class)
public class SubscribeCustomerInboundBrokerService {
    
	@StreamListener(target = BrokerInput.SUBSCRIBE_CUSTOMER)
    public void processHelloChannelGreeting(Customer customer) {
        System.out.println(customer);
    }
}
