package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;

import java.util.ArrayList;
import java.util.List;

public class PublishingSpecification extends AbstractSpecification<String> {

    @Override
    public boolean matchesField(Book book, String value) throws DataExeption {
        String publishing = book.getPublishing();
        return publishing.equalsIgnoreCase(value);
    }
}
