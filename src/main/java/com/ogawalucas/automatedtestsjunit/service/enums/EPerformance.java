package com.ogawalucas.automatedtestsjunit.service.enums;

import java.math.BigDecimal;

public enum EPerformance {

    BAD(BigDecimal.valueOf(0.03)),
    GOOD(BigDecimal.valueOf(0.15)),
    GREAT(BigDecimal.valueOf(0.20));

    private BigDecimal readjustmentValue;

    EPerformance(BigDecimal readjustmentValue) {
        this.readjustmentValue = readjustmentValue;
    }

    public BigDecimal getReadjustmentValue() {
        return readjustmentValue;
    }
}
