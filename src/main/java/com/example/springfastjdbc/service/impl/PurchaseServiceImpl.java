package com.example.springfastjdbc.service.impl;

import com.example.springfastjdbc.dto.InsertPurchaseDto;
import com.example.springfastjdbc.model.Purchase;
import com.example.springfastjdbc.repo.PurchaseRepository;
import com.example.springfastjdbc.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Override
    public void insertPurchase(InsertPurchaseDto dto) {

        log.info("Input InsertPurchaseDto parameters: product={}, price={}", dto.getProduct(), dto.getPrice());

        purchaseRepository.insertPurchase(
                new Purchase(dto.getProduct(), dto.getPrice()));

        log.info("Product {} with price {} successfully inserted", dto.getProduct(), dto.getPrice());
    }

    @Override
    public List<Purchase> getAllPurchase() {
        return purchaseRepository.getAllPurchase();
    }

}
