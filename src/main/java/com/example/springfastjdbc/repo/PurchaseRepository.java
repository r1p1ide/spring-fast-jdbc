package com.example.springfastjdbc.repo;

import com.example.springfastjdbc.model.Purchase;

import java.util.List;

public interface PurchaseRepository {

    List<Purchase> getAllPurchase();

    void insertPurchase(Purchase purchase);
}
