package com.BigCommerce.task.hengLiu.dto;

import com.BigCommerce.task.hengLiu.po.Order;

import java.math.BigDecimal;
import java.util.List;

public class CustomerOrdersDTO {
    private Integer id;

    private String dateCreated;

    private String dateModified;

    private String company;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private List<Order> orderList;

    private BigDecimal lifeTimeValue;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


    public BigDecimal getLifeTimeValue() {
        return lifeTimeValue;
    }

    public void setLifeTimeValue(BigDecimal lifeTimeValue) {
        this.lifeTimeValue = lifeTimeValue;
    }
}
