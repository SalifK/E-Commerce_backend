package com.electro.Electronic.models;

import javax.persistence.Id;
import java.util.Date;

public class Promotion {
    @Id
    public long id;
    public Date debutDate;
    public Date endDate;
    public float Percentage;
    public String description;
}
