package com.example.springfastjdbc.controller;

import com.example.springfastjdbc.dto.InsertPurchaseDto;
import com.example.springfastjdbc.model.Purchase;
import com.example.springfastjdbc.service.PurchaseService;
import com.example.springfastjdbc.util.InsertPurchaseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    private final PurchaseService purchaseService;

    @PostMapping("/insert")
    public ResponseEntity<InsertPurchaseResponse> insertPurchase(@RequestBody InsertPurchaseDto dto) {

        purchaseService.insertPurchase(dto);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new InsertPurchaseResponse(
                        200, LocalDateTime.now(), true));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Purchase>> getAllPurchase() {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(purchaseService.getAllPurchase());
    }
}
