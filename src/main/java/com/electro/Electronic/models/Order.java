package com.electro.Electronic.models;

import java.util.Date;

public class Order {
    public long id;
    public String status;
    public Date orderDate;
    public Date deliveryDate;
    public Product product;
    public Bill bill;

}
