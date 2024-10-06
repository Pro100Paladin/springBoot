package ru.medvedev.lesson4.homeWork4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.lesson4.homeWork4.entity.ReaderEntity;

public interface ReaderRepository extends JpaRepository<ReaderEntity,Long> {
}
