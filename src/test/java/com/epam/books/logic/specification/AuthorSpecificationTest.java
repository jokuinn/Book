package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;
import org.junit.Assert;
import org.junit.Test;

public class AuthorSpecificationTest {
    private static final Book FIRST_BOOK = new Book("firstTitle", 1999, "firstAuthor", "firstPublishing");
    private final AuthorSpecification specification = new AuthorSpecification();

    @Test
    public void testMatchesFieldShouldMatchWhenBookFieldAuthorIgnoreCaseValue() throws DataExeption{
        //given
        String value = "FirstAuthor";
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldNotMatchWhenBookFieldAuthorIgnoreCaseValue() throws DataExeption{
        //given
        String value = "Author";
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertFalse(actual);
    }
}
