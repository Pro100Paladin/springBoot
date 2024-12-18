package ru.medvedev.lesson6.homeWork6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.medvedev.lesson6.homeWork6.entity.IssueEntity;

import java.util.List;

public interface IssueRepository extends JpaRepository<IssueEntity,Long> {
    List<IssueEntity> findByReaderId(long readerId);

    @Query("select count(u) from IssueEntity u where (u.readerId = :id) and (u.returned_at is null)")
    Integer countBookByReaderId(long id);

}
