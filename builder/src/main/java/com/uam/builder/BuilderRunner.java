package com.uam.builder;

import com.uam.builder.product.BankingProduct;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class BuilderRunner {

    public static void main(String[] args) {
        BankingProduct product = BankingProduct
                .builder()
                .withBankId(1)
                .withClientId(2)
                .withDeposit(BigDecimal.ONE)
                .withExpirationDate(Instant.now().plusSeconds(TimeUnit.DAYS.toSeconds(7)))
                .withCreationDate(Instant.now())
                .build(12345);
        System.out.println(product.toString());
    }
}
