package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean matchesField(Book book, T value) throws DataExeption;

    @Override
    public List<Book> find(List<Book> books, T value) throws DataExeption {
        List<Book> searchedBooks = new ArrayList<>();
        for (Book book: books){
            if (matchesField(book, value)){
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
