package com.wakedata.wk.member.domain.customer.gateway;

import com.wakedata.wk.member.domain.customer.Customer;
import com.wakedata.wk.member.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
