package com.BigCommerce.task.hengLiu.dto;

import com.BigCommerce.task.hengLiu.po.Customer;

import java.util.List;

public class CustomersDTO {

    List<Customer> cusList;
    int totalOrderNumber;

    public List<Customer> getCusList() {
        return cusList;
    }

    public void setCusList(List<Customer> cusList) {
        this.cusList = cusList;
    }


    public int getTotalOrderNumber() {
        return totalOrderNumber;
    }

    public void setTotalOrderNumber(int totalOrderNumber) {
        this.totalOrderNumber = totalOrderNumber;
    }
}