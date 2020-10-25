package com.epam.books.logic.comparator;

import com.epam.books.data.Book;
import com.epam.books.logic.specification.YearSpecification;
import org.junit.Assert;
import org.junit.Test;

public class YearComparatorTest {
    private static final Book FIRST_BOOK = new Book(null, 1990, null, null);
    private static final Book SECOND_BOOK = new Book(null, 2000, null, null);
    private static final Book THIRD_BOOK = new Book(null, 1990, null, null);

    private final YearComparator comparator = new YearComparator();

    @Test
    public void testCompareShouldReturnNegativeWhenYearOneIsLessThanYearTwo() {
        //when
        int actual = comparator.compare(FIRST_BOOK, SECOND_BOOK);
        //then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenYearOneIsLessThanYearTwo() {
        //when
        int actual = comparator.compare(SECOND_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual > 0);
    }

    @Test
    public void testCompareShouldReturnZeroWhenYearOneIsEqualsYearThree() {
        //when
        int actual = comparator.compare(THIRD_BOOK, FIRST_BOOK);
        //then
        Assert.assertTrue(actual == 0);
    }
}
