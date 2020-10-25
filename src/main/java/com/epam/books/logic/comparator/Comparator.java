package com.epam.books.logic.comparator;

public interface Comparator<T> extends java.util.Comparator<T> {

    @Override
    int compare(T firstBook, T secondBook);

    @Override
    boolean equals(Object obj);
}
