package com.epam.books.logic;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;
import org.junit.Assert;
import org.junit.Test;

public class BookDaoTest {
    private static final Book FIRST_BOOK = new Book("firstTitle", 1999, "firstAuthor", "firstPublishing");
    private static final Book SECOND_BOOK = new Book("secondTitle", 1999, "secondAuthor", "secondPublishing");

    @Test
    public void testAddBookShouldAddBook() throws DataExeption{
        //given
        BookDao bookDao = new BookDao();
        int initialSize = bookDao.size();
        //when
        bookDao.addBook(FIRST_BOOK);
        int resultSize = bookDao.size();
        //then
        Assert.assertEquals(initialSize + 1, resultSize);

    }

    @Test
    public void testRemoveShouldRemoveBook() throws DataExeption {
        //given
        BookDao bookDao = new BookDao();
        bookDao.addBook(FIRST_BOOK);
        int initialSize = bookDao.size();
        //when
        bookDao.removeBook(FIRST_BOOK);
        //then
        int resultSize = bookDao.size();
        Assert.assertEquals(initialSize, resultSize + 1);
    }


}
