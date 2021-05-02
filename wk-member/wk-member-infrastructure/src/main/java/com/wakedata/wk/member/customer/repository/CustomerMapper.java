package com.wakedata.wk.member.customer.repository;

import com.wakedata.wk.member.customer.repository.model.CustomerDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper{

  public CustomerDO getById(String customerId);
}
