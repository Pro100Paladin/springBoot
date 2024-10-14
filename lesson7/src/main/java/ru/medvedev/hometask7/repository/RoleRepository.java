package ru.medvedev.hometask7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.hometask7.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
}
