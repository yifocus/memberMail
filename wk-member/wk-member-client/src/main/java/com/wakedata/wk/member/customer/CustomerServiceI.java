package com.wakedata.wk.member.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.wakedata.wk.member.customer.dto.CustomerAddCmd;
import com.wakedata.wk.member.customer.dto.CustomerListByNameQry;
import com.wakedata.wk.member.customer.dto.data.CustomerDTO;

public interface CustomerServiceI {

    public Response addCustomer(CustomerAddCmd customerAddCmd);

    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
