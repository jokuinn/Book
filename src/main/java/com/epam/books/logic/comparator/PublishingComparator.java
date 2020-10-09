package com.epam.books.logic.comparator;

import com.epam.books.data.Book;

public class PublishingComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstPublishing = firstBook.getPublishing();
        String secondPublishing = secondBook.getPublishing();
        return firstPublishing.compareToIgnoreCase(secondPublishing);
    }
}
