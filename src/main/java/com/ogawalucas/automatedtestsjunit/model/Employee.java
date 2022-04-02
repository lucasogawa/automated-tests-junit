package com.ogawalucas.automatedtestsjunit.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate admissionDate;
    private BigDecimal salary;

    public Employee(String name, LocalDate admissionDate, BigDecimal salary) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getAdmissionDate() {
        return this.admissionDate;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public boolean isValidSalaryToGetBonus() {
        return this.salary.compareTo(BigDecimal.valueOf(10000)) <= 0;
    }

    public void readjustSalary(BigDecimal readjust) {
        this.salary = this.salary.add(readjust);
        roundSalary();
    }

    private void roundSalary() {
        this.salary = this.salary.setScale(2, RoundingMode.HALF_UP);
    }
}

