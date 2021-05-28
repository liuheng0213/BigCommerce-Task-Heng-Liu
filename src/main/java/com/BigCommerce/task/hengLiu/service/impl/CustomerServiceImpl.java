package com.BigCommerce.task.hengLiu.service.impl;

import com.BigCommerce.task.hengLiu.dao.CustomerDao;
import com.BigCommerce.task.hengLiu.dto.CustomerOrdersDTO;
import com.BigCommerce.task.hengLiu.dto.CustomersDTO;
import com.BigCommerce.task.hengLiu.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public CustomersDTO getCustomersDTO() {
        return customerDao.selectCustomers();
    }

    @Override
    public CustomerOrdersDTO getCustomerOrdersDTO(long cid) {
        return customerDao.getCustomerOrdersDTO(cid);
    }
}
