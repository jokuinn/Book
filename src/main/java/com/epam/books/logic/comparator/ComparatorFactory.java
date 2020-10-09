package com.epam.books.logic.comparator;

import com.epam.books.logic.FieldBook;

public class ComparatorFactory {
    public Comparator create(FieldBook fieldBook){

        switch (fieldBook){
            case TITLE:
                return new TitleComparator();
            case YEAR:
                return new YearComparator();
            case AUTHOR:
                return new AuthorComparator();
            case PUBLISHING:
                return new PublishingComparator();
            default:
                throw new IllegalArgumentException("Incorrect field" + fieldBook);
        }

    }
}
