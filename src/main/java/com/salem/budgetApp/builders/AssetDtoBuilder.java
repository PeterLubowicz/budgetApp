package com.salem.budgetApp.builders;

import com.salem.budgetApp.services.dtos.AssetDto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class AssetDtoBuilder {
    private UUID id;
    private BigDecimal amount;
    private Instant incomeDate;

    public AssetDtoBuilder withId(UUID id){
        this.id = id;
        return this;
    }

    public AssetDtoBuilder withAmount(BigDecimal amount){
        this.amount = amount;
        return this;
    }

    public AssetDtoBuilder withIncomeDate(Instant incomeDate){
        this.incomeDate = incomeDate;
        return this;
    }

    public AssetDto build(){
        var dto = new AssetDto();
        dto.setId(this.id);
        dto.setAmount(this.amount);
        dto.setIncomeDate(this.incomeDate);
        return dto;
    }
}
