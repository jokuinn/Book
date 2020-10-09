package com.epam.books.data;

import java.util.ArrayList;

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
        return super.equals(obj);
    }
}
