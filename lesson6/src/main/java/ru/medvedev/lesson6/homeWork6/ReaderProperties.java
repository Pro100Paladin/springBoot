package ru.medvedev.lesson6.homeWork6;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("application.reader")
public class ReaderProperties {

    private int maxAllowedBooks = 3;

    public int getMaxAllowedBooks() {
        return maxAllowedBooks;
    }

    public void setMaxAllowedBooks(int maxAllowedBooks) {
        this.maxAllowedBooks = maxAllowedBooks;
    }

}
