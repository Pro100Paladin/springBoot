package ru.medvedev.timesheet.service;

import org.springframework.stereotype.Service;
import ru.medvedev.timesheet.model.Timesheet;
import ru.medvedev.timesheet.repository.ProjectRepository;
import ru.medvedev.timesheet.repository.TimesheetRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class TimesheetService {
    private final TimesheetRepository timesheetRepository;
    private final ProjectRepository projectRepository;

    public TimesheetService(TimesheetRepository repository, ProjectRepository projectRepository) {
        this.timesheetRepository = repository;
        this.projectRepository = projectRepository;
    }

    public Optional<Timesheet> findById(Long id) {
        return timesheetRepository.findById(id);
    }

    public List<Timesheet> findAll() {
        return findAll(null, null);
    }
    public List<Timesheet> getAll() {
        return timesheetRepository.findAll();
    }

    public List<Timesheet> findAll(LocalDate createdAtBefore, LocalDate createdAtAfter) {
        // FIXME: Вернуть фильтрацию

        return timesheetRepository.findAll();
    }

    public Timesheet create(Timesheet timesheet) {
        if (Objects.isNull(timesheet.getProjectId())) {
            throw new IllegalArgumentException("projectId must not be null");
        }

        if (projectRepository.findById(timesheet.getProjectId()).isEmpty()) {
            throw new NoSuchElementException("Project with id " + timesheet.getProjectId() + " does not exists");
        }

        timesheet.setCreatedAt(LocalDate.now());
        return timesheetRepository.save(timesheet);
    }

    public void delete(Long id) {
        timesheetRepository.deleteById(id);
    }

    public Optional<Timesheet> getTimesheetsByEmployeeId(Long id) {
        if (timesheetRepository.findByEmployeeId(id).isEmpty()) {
            throw new NoSuchElementException("Employee with id = " + id + " does not exists");
        }

        return timesheetRepository.findByEmployeeId(id);
    }
    public Optional<Timesheet> update(Long id, Timesheet timesheet) {
        Optional<Timesheet> needUpdate = findById(id);

        if (needUpdate.isPresent()) {
            timesheet.setId(needUpdate.get().getId());
            timesheetRepository.save(timesheet);
            return Optional.of(timesheet);
        }

        return Optional.empty();
    }
}