package com.epam.books.logic.comparator;

import com.epam.books.data.Book;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book firstBook, Book secondBook) {
        String firstAuthor = firstBook.getAuthor();
        String secondAuthor = secondBook.getAuthor();
        return firstAuthor.compareToIgnoreCase(secondAuthor);
    }
}
