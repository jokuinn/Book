package com.epam.books.logic.specification;

import com.epam.books.data.Book;

import java.util.ArrayList;
import java.util.List;

public class TitleSpecification implements Specification<String> {

    @Override
    public List<Book> find(List<Book> books, String value) {
        List<Book> searchedBooks = new ArrayList<>();

        for (Book book: books){

            String titleBook = book.getTitle();
            if (titleBook.equalsIgnoreCase(value)){
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
