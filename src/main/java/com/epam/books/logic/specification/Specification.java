package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;

import java.util.List;

public interface Specification<T> {
    List<Book> find(List<Book> books, T value) throws DataExeption;
}
