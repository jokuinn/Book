package com.epam.books.logic.specification;

import com.epam.books.data.Book;

import java.util.ArrayList;
import java.util.List;

public class TitleSpecification extends AbstractSpecification<String> {

    @Override
    public boolean matchesField(Book book, String value) {
        String title = book.getTitle();
        return title.equalsIgnoreCase(value);
    }

}
