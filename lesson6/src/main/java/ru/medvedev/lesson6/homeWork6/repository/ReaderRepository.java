package ru.medvedev.lesson6.homeWork6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.lesson6.homeWork6.entity.ReaderEntity;

public interface ReaderRepository extends JpaRepository<ReaderEntity,Long> {
}