package com.epam.books.logic.specification;

import com.epam.books.data.Book;
import com.epam.books.data.DataExeption;
import org.junit.Assert;
import org.junit.Test;

public class PublishingSpecificationTest {
    private static final Book FIRST_BOOK = new Book("firstTitle", 1999, "firstAuthor", "firstPublishing");
    private final PublishingSpecification specification = new PublishingSpecification();

    @Test
    public void testMatchesFieldShouldMatchWhenBookFieldPublishingIgnoreCaseValue() throws DataExeption {
        //given
        String value = "FirstPublishing";
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testMatchesFieldShouldNotMatchWhenBookFieldPublishingIgnoreCaseValue() throws DataExeption{
        //given
        String value = "Publishing";
        //when
        boolean actual = specification.matchesField(FIRST_BOOK, value);
        //then
        Assert.assertFalse(actual);
    }
}
