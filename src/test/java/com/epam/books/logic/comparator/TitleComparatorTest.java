package com.epam.books.logic.comparator;

import com.epam.books.data.Book;
import org.junit.Assert;
import org.junit.Test;

public class TitleComparatorTest {
    private static final Book FIRST_BOOK = new Book("a", 0, null, null);
    private static final Book SECOND_BOOK = new Book("b", 0, null, null);
    private static final Book THIRD_BOOK = new Book("a", 0, null, null);
    private static final Book FOURTH_BOOK = new Book(null, 0, null, null);

    private final TitleComparator comparator = new TitleComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenAuthorNullCompareAuthorNotNull() {
        //when
        int actual = comparator.compare(FOURTH_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenAuthorNotNullCompareAuthorNull() {
        //when
        int actual = comparator.compare(FIRST_BOOK, FOURTH_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }
    @Test
    public void testCompareShouldReturnZeroWhenAuthorNullCompareAuthorNull() {
        //when
        int actual = comparator.compare(FOURTH_BOOK, FOURTH_BOOK);
        //then
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenAuthorOneIsLessThanAuthorTwo() {
        //when
        int actual = comparator.compare(FIRST_BOOK, SECOND_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenAuthorOneIsLessThanAuthorTwo() {
        //when
        int actual = comparator.compare(SECOND_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenAuthorOneIsEqualsAuthorThree() {
        //when
        int actual = comparator.compare(THIRD_BOOK, FIRST_BOOK);
        //then
        Assert.assertEquals(0, actual);
    }
}
