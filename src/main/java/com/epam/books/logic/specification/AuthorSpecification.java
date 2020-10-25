package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorSpecification extends AbstractSpecification<String> {

    @Override
    public boolean matchesField(Book book, String value) throws DataExeption {
        String author = book.getAuthor();
        return author.equalsIgnoreCase(value);
    }
}

