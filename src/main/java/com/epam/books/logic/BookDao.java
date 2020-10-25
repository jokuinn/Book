package com.epam.books.logic;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;
import com.epam.books.logic.comparator.Comparator;
import com.epam.books.logic.comparator.ComparatorFactory;
import com.epam.books.logic.specification.AbstractSpecification;
import com.epam.books.logic.specification.SpecificationFactory;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookDao implements Dao {

    private final SpecificationFactory specificationFactory = new SpecificationFactory();
    private final ComparatorFactory comparatorfactory = new ComparatorFactory();

    public final List<Book> books = new ArrayList<>();
    public final static Book HARRY_POTTER = new Book("Harry Potter", 1997, "Joanne Rowling", "Bloomsbury Publishing");
    public final static Book CALL_OF_CTHULHU = new Book("The Call of Cthulhu", 1928, "Howard Lovecraft", "Weird Tales");
    public final static Book METRO = new Book(" 2033", 2007, "Dmitry Glukhovsky", "Popular literature");
    public final static Book WITCHER = new Book("The Saga of the Witcher", 1986, "Andrzej Sapkowski", "superNOWA");
    public final static Book LITTLE_PRINCE = new Book("The Little Prince", 1943, "Antoine de Saint-Exupery", "Raynal&Hitchcock");

    @Override
    public void addBooks(){
        books.add(HARRY_POTTER);
        books.add(WITCHER);
    }

    @Override
    public void addBook(Book book) throws DataExeption {
        if (books.contains(book)) {
            throw new DataExeption("List of books has book");
        }
        books.add(book);
    }

    @Override
    public void removeBook(Book book) throws DataExeption {
        if (!books.contains(book)) {
            throw new DataExeption("List of books hasn't book");
        }
        books.remove(book);
    }

    @Override
    public <T> List<Book> findByTag(BookFieldType fieldBook, T value) throws DataExeption {
        AbstractSpecification specification = specificationFactory.create(fieldBook);
        return specification.find(books, value);
    }

    @Override
    public void sortByTag(BookFieldType fieldBook){
        Comparator<Book> comparator = comparatorfactory.create(fieldBook);
        Collections.sort(books, comparator);
    }

    public int size(){
        return books.size();
    }
}
