package ru.medvedev.lesson4.homeWork4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("application.reader")
public class ReaderProperties {

    private int maxAllowedBooks;

    public int getMaxAllowedBooks() {
        return maxAllowedBooks;
    }

    public void setMaxAllowedBooks(int maxAllowedBooks) {
        this.maxAllowedBooks = maxAllowedBooks;
    }

}
