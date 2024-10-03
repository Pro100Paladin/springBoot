package ru.medvedev.lesson4.homeWork4.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.medvedev.lesson4.homeWork4.service.BookService;
import ru.medvedev.lesson4.homeWork4.service.IssueService;
import ru.medvedev.lesson4.homeWork4.service.ReaderService;

@Controller
@RequestMapping("/home")
public class UIController {

    private final BookService bookService;
    private final IssueService issueService;
    private final ReaderService readerService;

    public UIController(BookService bookService, IssueService issueService, ReaderService readerService) {
        this.bookService = bookService;
        this.issueService = issueService;
        this.readerService = readerService;
    }

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    @GetMapping("/readers")
    public String getAllReaders(Model model) {
        model.addAttribute("readers", readerService.getAllReaders());
        return "readers";
    }

    @GetMapping("/issues")
    public String getAllIssues(Model model) {
        model.addAttribute("issues", issueService.getAllIssues());
        model.addAttribute("readers", readerService.getAllReaders());
        model.addAttribute("books", bookService.getAllBooks());
        return "issues";
    }

    @GetMapping("/reader/{id}")
    public String readerBooks(@PathVariable long id, Model model) {
        model.addAttribute("reader", readerService.getReaderById(id));
        model.addAttribute("books", issueService.getIssuesByReader(id));
        return "booksOfReader";
    }
}
