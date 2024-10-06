package ru.medvedev.lesson4.homeWork4.service;

import ru.medvedev.lesson4.homeWork4.controller.IssueRequest;
import ru.medvedev.lesson4.homeWork4.entity.IssueEntity;

import java.util.List;
import java.util.Optional;

public interface IssueService {

    IssueEntity addIssue(IssueRequest request);

    Optional<IssueEntity> getIssueById(long id);

    List<IssueEntity> getIssuesByReader(long id);

    List<IssueEntity> getAllIssues();

    Optional<IssueEntity> returnBook(long id);
}