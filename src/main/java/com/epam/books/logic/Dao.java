package com.epam.books.logic;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;

import java.util.List;

public interface Dao {
    void addBooks();
    void addBook(Book book) throws DataExeption;
    void removeBook(Book book) throws DataExeption;
    <T> List<Book> findByTag(BookFieldType fieldBook, T value) throws DataExeption;
    void sortByTag(BookFieldType fieldBook) throws DataExeption;
}
