package com.BigCommerce.task.hengLiu.controller;

import com.BigCommerce.task.hengLiu.dto.CustomerOrdersDTO;
import com.BigCommerce.task.hengLiu.dto.CustomersDTO;
import com.BigCommerce.task.hengLiu.result.ResultBody;
import com.BigCommerce.task.hengLiu.service.ICustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;


@Controller()
@RequestMapping(value = "/bigcommerce/customer")
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    ICustomerService customerService;


    /**
     * A list of Customers, including the total number of orders they have placed
     * @return
     */
    @GetMapping("/totalOrderNumber")
    @ResponseBody
    public ResultBody customerOrderTotalNumber() {
        CustomersDTO customersDTO = null;
        try {
            customersDTO = customerService.getCustomersDTO();
            return ResultBody.success(customersDTO);
        } catch (Exception e) {
            return ResultBody.error(e.getMessage());
        }

    }


    /**
     * A Customer Details screen that displays the Order History for that Customer
     * and their Lifetime Value (defined as the
     * total value of all of their orders)
     * @param customerId
     * @return
     */
    @GetMapping("/orderLifeValue/{id}")
    @ResponseBody
    public ResultBody customerOrderValue(@PathVariable(value = "id") String customerId) {
        CustomerOrdersDTO customerOrdersDTO = null;
        try {
            Long cid = Long.valueOf(customerId);
            customerOrdersDTO = customerService.getCustomerOrdersDTO(cid);
            return ResultBody.success(customerOrdersDTO);
        } catch (NumberFormatException e) {
            logger.error("error in orderLifeValue function : " + e.getMessage());
            throw new NumberFormatException("you sent a wrong parameter!");
        }
    }




}
