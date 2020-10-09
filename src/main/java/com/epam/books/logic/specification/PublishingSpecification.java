package com.epam.books.logic.specification;

import com.epam.books.data.Book;

import java.util.ArrayList;
import java.util.List;

public class PublishingSpecification implements Specification<String> {

    @Override
    public List<Book> find(List<Book> books, String value) {
        List<Book> searchedBooks = new ArrayList<>();

        for (Book book: books){

            String publishingBook = book.getPublishing();
            if (publishingBook.equalsIgnoreCase(value)){
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }
}
