package com.ogawalucas.automatedtestsjunit.service;

import com.ogawalucas.automatedtestsjunit.model.Employee;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calculate(Employee employee) {
        var bonus = employee.getSalary().multiply(new BigDecimal("0.1"));

        if (!employee.isValidSalaryToGetBonus()) {
            throw new IllegalArgumentException("Employee with salary greater than 10000");
        }

        return bonus;
    }
}
