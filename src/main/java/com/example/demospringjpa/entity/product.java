package com.example.demospringjpa.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tbl_product")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;
    private float price;
}
