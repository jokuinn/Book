package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;
import org.junit.Assert;
import org.junit.Test;

public class TitleSpecificationTest {
    private static final Book FIRST_BOOK = new Book("firstTitle", 1999, "firstAuthor", "firstPublishing");
    private final TitleSpecification specification = new TitleSpecification();

    @Test
    public void testMatchesFieldShouldMatchWhenBookFieldTitleIgnoreCaseValue() throws DataExeption {
        //given
        String value = "FirstTitle";
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldNotMatchWhenBookFieldTitleIgnoreCaseValue() throws DataExeption{
        //given
        String value = "Title";
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertFalse(actual);
    }
}
