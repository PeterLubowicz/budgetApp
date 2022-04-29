package com.salem.budgetApp.services.dtos;

import com.salem.budgetApp.enums.AssetCategory;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class AssetDto {
    private UUID id;
    private BigDecimal amount;
    private Instant incomeDate;
    private AssetCategory category;
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Instant getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Instant incomeDate) {
        this.incomeDate = incomeDate;
    }

    public AssetCategory getCategory() {
        return category;
    }

    public void setCategory(AssetCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AssetDto assetDto = (AssetDto) o;
        return Objects.equals(id, assetDto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AssetDto{" +
                "id=" + id +
                ", amount=" + amount +
                ", incomeDate=" + incomeDate +
                ", category=" + category +
                ", description='" + description + '\'' +
                '}';
    }
}
