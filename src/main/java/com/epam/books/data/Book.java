package com.epam.books.data;

public class Book {
    String title;
    int year;
    String author;
    String publishing;

    public Book(String title, int year, String author, String publishing){
        this.title = title;
        this.year = year;
        this.author = author;
        this.publishing = publishing;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;

        if (getYear() != book.getYear()) {
            return false;
        }
        if (!getAuthor().equals(book.getAuthor())) {
            return false;
        }
        if (!getTitle().equals(book.getTitle())) {
            return false;
        }
        return getPublishing().equals(book.getPublishing());
    }
}
