package com.uam.builder.product;

import java.math.BigDecimal;
import java.time.Instant;

public class BankingProduct {

    private long id;
    private long bankId;
    private long clientId;
    private BigDecimal deposit;
    private Instant creationDate;
    private Instant expirationDate;

    private BankingProduct() {
    }

    public long getId() {
        return id;
    }

    public long getBankId() {
        return bankId;
    }

    public long getClientId() {
        return clientId;
    }
    public BigDecimal getDeposit() {
        return deposit;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public Instant getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "BankingProduct{" +
                "id=" + id +
                ", bankId=" + bankId +
                ", clientId=" + clientId +
                ", deposit=" + deposit +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private long id;
        private long bankId;
        private long clientId;
        private BigDecimal deposit;
        private Instant creationDate;
        private Instant expirationDate;

        private Builder() {
        }

        public Builder withBankId(long bankId) {
            this.bankId = bankId;
            return this;
        }

        public Builder withClientId(long clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder withDeposit(BigDecimal deposit) {
            this.deposit = deposit;
            return this;
        }

        public Builder withCreationDate(Instant creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder withExpirationDate(Instant expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public BankingProduct build(long id) {
            BankingProduct product = new BankingProduct();
            product.id = id;
            product.bankId = this.bankId;
            product.clientId = this.clientId;
            product.deposit = this.deposit;
            product.creationDate = this.creationDate;
            product.expirationDate = this.expirationDate;
            return product;
        }

    }
}