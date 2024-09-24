package ru.medvedev.lesson3.homeWork3.service;

import org.springframework.stereotype.Service;
import ru.medvedev.lesson3.homeWork3.model.Book;
import ru.medvedev.lesson3.homeWork3.repository.BookRepository;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookById(long id) {
        return bookRepository.getBookById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public void deleteBook(long id) {
        bookRepository.deleteBook(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

}
