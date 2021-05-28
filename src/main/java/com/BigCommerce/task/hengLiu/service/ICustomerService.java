package com.BigCommerce.task.hengLiu.service;

import com.BigCommerce.task.hengLiu.dto.CustomerOrdersDTO;
import com.BigCommerce.task.hengLiu.dto.CustomersDTO;

public interface ICustomerService {
    CustomersDTO getCustomersDTO();
    CustomerOrdersDTO getCustomerOrdersDTO(long cid);
}
