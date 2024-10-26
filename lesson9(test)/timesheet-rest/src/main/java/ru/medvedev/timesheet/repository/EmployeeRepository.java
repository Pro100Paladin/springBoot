package ru.medvedev.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.timesheet.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
