package ru.medvedev.lesson8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.lesson8.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByLogin(String login);

}
