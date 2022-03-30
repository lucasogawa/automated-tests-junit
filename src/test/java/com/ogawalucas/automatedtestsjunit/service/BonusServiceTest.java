package com.ogawalucas.automatedtestsjunit.service;

import com.ogawalucas.automatedtestsjunit.model.Employee;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    private static final BonusService service = new BonusService();

    @Test
    public void mustReturn0IfSalaryGreaterThan10000() {
        var expected = BigDecimal.ZERO;
        var actual = service.calculate(new Employee(null, null, BigDecimal.valueOf(10001)));

        assertEquals(expected, actual);
    }

    @Test
    public void mustReturn10PercentOfSalaryIfSalaryLessThan10000() {
        var expected = BigDecimal.valueOf(900.0);
        var actual = service.calculate(new Employee(null, null, BigDecimal.valueOf(9000)));

        assertEquals(expected, actual);
    }

    @Test
    public void mustReturn10PercentOfSalaryIfSalaryIgualTo10000() {
        var expected = BigDecimal.valueOf(1000.0);
        var actual = service.calculate(new Employee(null, null, BigDecimal.valueOf(10000)));

        assertEquals(expected, actual);
    }
}
