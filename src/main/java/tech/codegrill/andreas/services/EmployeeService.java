package tech.codegrill.andreas.services;

import tech.codegrill.andreas.models.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(String id);
}
