package ru.medvedev.lesson8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.lesson8.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
