package ru.medvedev.lesson6.homeWork6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.medvedev.lesson6.homeWork6.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
}
