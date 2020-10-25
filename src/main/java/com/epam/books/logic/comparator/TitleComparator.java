package com.epam.books.logic.comparator;

import com.epam.books.data.Book;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstTitle = firstBook.getTitle();
        String secondTitle = secondBook.getTitle();
        if ((firstTitle == null) && (secondTitle == null)) {
            return 0;
        }
        if (firstTitle == null) {
            return -1;
        }
        if (secondTitle == null) {
            return 1;
        }
        return firstTitle.compareToIgnoreCase(secondTitle);
    }
}
