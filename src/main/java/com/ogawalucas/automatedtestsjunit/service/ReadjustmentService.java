package com.ogawalucas.automatedtestsjunit.service;

import com.ogawalucas.automatedtestsjunit.model.Employee;
import com.ogawalucas.automatedtestsjunit.service.enums.EPerformance;

public class ReadjustmentService {

    public void readjust(Employee employee, EPerformance performance) {
        employee.readjustSalary(employee.getSalary().multiply(performance.getReadjustmentValue()));
    }
}
