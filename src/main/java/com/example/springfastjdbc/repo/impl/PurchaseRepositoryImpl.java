package com.example.springfastjdbc.repo.impl;

import com.example.springfastjdbc.model.Purchase;
import com.example.springfastjdbc.repo.PurchaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.springfastjdbc.util.sql.SqlStrings.GET_ALL_PURCHASE_SQL;
import static com.example.springfastjdbc.util.sql.SqlStrings.INSERT_PURCHASE_SQL;

@Repository
@RequiredArgsConstructor
public class PurchaseRepositoryImpl implements PurchaseRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<Purchase> getAllPurchase() {
        return jdbcTemplate.query(GET_ALL_PURCHASE_SQL, ((rs, rowNum) ->
                new Purchase(
                        rs.getInt("id"),
                        rs.getString("product"),
                        rs.getBigDecimal("price"))
        ));
    }

    @Override
    public void insertPurchase(Purchase purchase) {
        jdbcTemplate.update(INSERT_PURCHASE_SQL, purchase.getProduct(), purchase.getPrice());
    }
}
