package ru.medvedev.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.timesheet.model.Project;

//@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
