package com.epam.books.logic.comparator;

import com.epam.books.data.Book;

public class PublishingComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstPublishing = firstBook.getPublishing();
        String secondPublishing = secondBook.getPublishing();
        if ((firstPublishing == null) && (secondPublishing == null)) {
            return 0;
        }
        if (firstPublishing == null) {
            return -1;
        }
        if (secondPublishing == null) {
            return 1;
        }
        return firstPublishing.compareToIgnoreCase(secondPublishing);
    }
}
