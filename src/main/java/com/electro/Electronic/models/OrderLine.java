package com.electro.Electronic.models;

import javax.persistence.Id;

public class OrderLine {
    @Id
    public Order order;
}
