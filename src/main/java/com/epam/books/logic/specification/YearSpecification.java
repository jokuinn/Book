package com.epam.books.logic.specification;

import com.epam.books.data.Book;

import java.util.ArrayList;
import java.util.List;

public class YearSpecification implements Specification<Integer> {
    @Override
    public List<Book> find(List<Book> books, Integer value) {
        List<Book> searchedBooks = new ArrayList<>();

        for (Book book: books){

            Integer yearBook = book.getYear();
            if (yearBook.equals(value)){
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
