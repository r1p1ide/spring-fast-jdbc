package com.example.springfastjdbc.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class InsertPurchaseResponse {

    private int status;
    private LocalDateTime dateTime;
    private boolean success;
}
