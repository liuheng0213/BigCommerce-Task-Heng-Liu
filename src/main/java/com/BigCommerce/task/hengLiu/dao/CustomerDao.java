package com.BigCommerce.task.hengLiu.dao;


import com.BigCommerce.task.hengLiu.dto.CustomerOrdersDTO;
import com.BigCommerce.task.hengLiu.dto.CustomersDTO;
import com.BigCommerce.task.hengLiu.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
    @Autowired
    CustomerMapper customerMapper;


    public CustomersDTO selectCustomers() {
        CustomersDTO customersDTO = customerMapper.selectCustomers();
        return customersDTO;
    }

    public CustomerOrdersDTO getCustomerOrdersDTO(long cid) {
        CustomerOrdersDTO customerOrdersDTO = customerMapper.getCustomerOrdersDTO(cid);
        return customerOrdersDTO;
    }
}
