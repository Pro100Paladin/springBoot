package ru.medvedev.hometask7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.hometask7.entity.ReaderEntity;

public interface ReaderRepository extends JpaRepository<ReaderEntity,Long> {
}
