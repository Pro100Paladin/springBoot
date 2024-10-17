package ru.medvedev.lesson8.service;

import org.springframework.stereotype.Service;
import ru.medvedev.lesson8.model.Employee;
import ru.medvedev.lesson8.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
