package com.epam.books.logic.comparator;

import com.epam.books.data.Book;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();
        return firstTitle.compareToIgnoreCase(secondTitle);
    }
}
