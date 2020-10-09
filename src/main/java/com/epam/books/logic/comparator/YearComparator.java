package com.epam.books.logic.comparator;

import com.epam.books.data.Book;

public class YearComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        Integer firstYear = firstBook.getYear();
        Integer secondYear = secondBook.getYear();
        return firstYear.compareTo(secondYear);
    }
}
