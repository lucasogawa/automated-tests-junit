package com.ogawalucas.automatedtestsjunit.service;

import com.ogawalucas.automatedtestsjunit.model.Employee;
import com.ogawalucas.automatedtestsjunit.service.enums.EPerformance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    private ReadjustmentService service;
    private Employee employee;

    @BeforeEach
    public void initializr() {
        this.service = new ReadjustmentService();
        this.employee = new Employee(null, null, BigDecimal.valueOf(1000));
    }

    @Test
    public void mustReadjustment3PerCentOfSalaryIfPerformanceIsBad() {
        service.readjust(employee, EPerformance.BAD);

        var expected = BigDecimal.valueOf(1030).setScale(2, RoundingMode.HALF_UP);
        var actual = employee.getSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void mustReadjustment15PerCentOfSalaryIfPerformanceIsGood() {
        service.readjust(employee, EPerformance.GOOD);

        var expected = BigDecimal.valueOf(1150).setScale(2, RoundingMode.HALF_UP);
        var actual = employee.getSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void mustReadjustment20PerCentOfSalaryIfPerformanceIsGreat() {
        service.readjust(employee, EPerformance.GREAT);

        var expected = BigDecimal.valueOf(1200).setScale(2, RoundingMode.HALF_UP);
        var actual = employee.getSalary();

        assertEquals(expected, actual);
    }
}
