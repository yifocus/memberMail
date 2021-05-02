package com.wakedata.wk.member.domain.customer.gateway;

import com.wakedata.wk.member.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
