package com.example.springfastjdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Purchase {

    private int id;
    private String product;
    private BigDecimal price;

    public Purchase(int id, String product, BigDecimal price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public Purchase(String product, BigDecimal price) {
        this.product = product;
        this.price = price;
    }
}
