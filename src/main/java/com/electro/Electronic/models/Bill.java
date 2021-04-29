package com.electro.Electronic.models;

import java.util.Date;

public class Bill {
    public String reference;
    public Date date;
    public Order order;
    public float vat;
    public float totalPrice;
}
