package com.BigCommerce.task.hengLiu.mapper;

import com.BigCommerce.task.hengLiu.dto.CustomerOrdersDTO;
import com.BigCommerce.task.hengLiu.dto.CustomersDTO;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {


    CustomersDTO selectCustomers();

    CustomerOrdersDTO getCustomerOrdersDTO(@Param(value="cid") long cid);
}