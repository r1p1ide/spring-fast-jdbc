package com.example.springfastjdbc.service;

import com.example.springfastjdbc.dto.InsertPurchaseDto;
import com.example.springfastjdbc.model.Purchase;

import java.util.List;

public interface PurchaseService {

    void insertPurchase(InsertPurchaseDto dto);

    List<Purchase> getAllPurchase();
}
