package com.wakedata.wk.member.customer;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.wakedata.wk.member.customer.dto.CustomerAddCmd;
import com.wakedata.wk.member.customer.dto.CustomerListByNameQry;
import com.wakedata.wk.member.customer.dto.data.CustomerDTO;
import org.springframework.stereotype.Service;

import com.wakedata.wk.member.customer.executor.CustomerAddCmdExe;
import com.wakedata.wk.member.customer.executor.query.CustomerListByNameQryExe;

import javax.annotation.Resource;


@Service
@CatchAndLog
public class CustomerServiceImpl implements CustomerServiceI {

    @Resource
    private CustomerAddCmdExe customerAddCmdExe;

    @Resource
    private CustomerListByNameQryExe customerListByNameQryExe;

    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return customerAddCmdExe.execute(customerAddCmd);
    }

    @Override
    public MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry) {
        return customerListByNameQryExe.execute(customerListByNameQry);
    }

}