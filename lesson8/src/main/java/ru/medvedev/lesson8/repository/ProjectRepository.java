package ru.medvedev.lesson8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.lesson8.model.Project;

//@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
