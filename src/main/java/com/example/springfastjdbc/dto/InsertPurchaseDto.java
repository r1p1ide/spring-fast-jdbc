package com.example.springfastjdbc.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InsertPurchaseDto {

    private String product;
    private BigDecimal price;
}
