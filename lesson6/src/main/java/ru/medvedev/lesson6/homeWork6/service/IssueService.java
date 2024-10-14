package ru.medvedev.lesson6.homeWork6.service;

import ru.medvedev.lesson6.homeWork6.controller.IssueRequest;
import ru.medvedev.lesson6.homeWork6.entity.IssueEntity;

import java.util.List;
import java.util.Optional;

public interface IssueService {

    IssueEntity addIssue(IssueRequest request);

    Optional<IssueEntity> getIssueById(long id);

    List<IssueEntity> getIssuesByReader(long id);

    List<IssueEntity> getAllIssues();

    Optional<IssueEntity> returnBook(long id);
}