package com.wakedata.wk.member.customer;

import com.wakedata.wk.member.customer.repository.model.CustomerDO;
import com.wakedata.wk.member.customer.repository.CustomerMapper;
import com.wakedata.wk.member.domain.customer.Customer;
import com.wakedata.wk.member.domain.customer.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
//    @Autowired
//    private CustomerMapper customerMapper;

    public Customer getByById(String customerId){
//      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
      return null;
    }
}
