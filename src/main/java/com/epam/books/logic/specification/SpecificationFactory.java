package com.epam.books.logic.specification;

import com.epam.books.logic.BookFieldType;

public class SpecificationFactory {
    public AbstractSpecification create(BookFieldType fieldBook){
        switch (fieldBook){
            case TITLE:
                return new TitleSpecification();
            case YEAR:
                return new YearSpecification();
            case AUTHOR:
                return new AuthorSpecification();
            case PUBLISHING:
                return new PublishingSpecification();
            default:
                throw new IllegalArgumentException("Incorrect field" + fieldBook);
        }

    }

}
