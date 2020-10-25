package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;

public class YearSpecification extends AbstractSpecification<Integer> {

    @Override
    public boolean matchesField(Book book, Integer value) throws DataExeption {
        int year = book.getYear();
        if (value == null){
            throw new DataExeption("null value");
        }
        return value.equals(year);
    }
}
