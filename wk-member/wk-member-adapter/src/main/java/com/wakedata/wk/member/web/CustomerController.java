package com.wakedata.wk.member.web;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.fastjson.JSONObject;
import com.wakedata.wk.member.customer.CustomerServiceI;
import com.wakedata.wk.member.customer.dto.CustomerAddCmd;
import com.wakedata.wk.member.customer.dto.CustomerListByNameQry;
import com.wakedata.wk.member.customer.dto.data.CustomerDTO;
import com.wakedata.wk.member.score.rpc.ScoreRecordRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;

    @Autowired
    private ScoreRecordRpcService scoreRecordRpcService;

    @GetMapping(value = "/query")
    public String queryById(Long id){
        Object obj = scoreRecordRpcService.detail(id);
        return JSONObject.toJSONString(obj);
    }

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA world!";
    }

    @GetMapping(value = "/customer")
    public MultiResponse<CustomerDTO> listCustomerByName(@RequestParam(required = false) String name){
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd){
        return customerService.addCustomer(customerAddCmd);
    }
}
