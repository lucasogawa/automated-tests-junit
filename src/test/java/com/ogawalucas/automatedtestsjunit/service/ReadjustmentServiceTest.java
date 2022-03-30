package com.ogawalucas.automatedtestsjunit.service;

import com.ogawalucas.automatedtestsjunit.model.Employee;
import com.ogawalucas.automatedtestsjunit.service.enums.EPerformance;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    private static final ReadjustmentService service = new ReadjustmentService();

    @Test
    public void mustReadjustment3PerCentOfSalaryIfPerformanceIsBad() {
        var expected = BigDecimal.valueOf(1030).setScale(2, RoundingMode.HALF_UP);
        var actual = new Employee(null, null, BigDecimal.valueOf(1000));

        service.readjust(actual, EPerformance.BAD);

        assertEquals(expected, actual.getSalary());
    }

    @Test
    public void mustReadjustment15PerCentOfSalaryIfPerformanceIsGood() {
        var expected = BigDecimal.valueOf(1150).setScale(2, RoundingMode.HALF_UP);
        var actual = new Employee(null, null, BigDecimal.valueOf(1000));

        service.readjust(actual, EPerformance.GOOD);

        assertEquals(expected, actual.getSalary());
    }

    @Test
    public void mustReadjustment20PerCentOfSalaryIfPerformanceIsGreat() {
        var expected = BigDecimal.valueOf(1200).setScale(2, RoundingMode.HALF_UP);
        var actual = new Employee(null, null, BigDecimal.valueOf(1000));

        service.readjust(actual, EPerformance.GREAT);

        assertEquals(expected, actual.getSalary());
    }
}
