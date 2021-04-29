package com.electro.Electronic.models;

import javax.persistence.Id;

public class Product {
    @Id
    public long id;
    public String name;
    public String brand;
    public String description;
    public String image;
    public String color;
    public float price;
    public int quantity;

}
