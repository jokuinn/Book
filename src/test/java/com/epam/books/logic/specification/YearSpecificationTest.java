package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;
import org.junit.Assert;
import org.junit.Test;

public class YearSpecificationTest {
    private static final Book FIRST_BOOK = new Book("firstTitle", 1999, "firstAuthor", "firstPublishing");
    private final YearSpecification specification = new YearSpecification();

    @Test
    public void testMatchesFieldShouldMatchWhenBookFieldYearValue() throws DataExeption {
        //given
        int value = 1999;
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldNotMatchWhenBookFieldYearValue() throws DataExeption{
        //given
        int value = 1;
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertFalse(actual);
    }
}
