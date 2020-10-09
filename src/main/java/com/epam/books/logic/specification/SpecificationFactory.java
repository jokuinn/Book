package com.epam.books.logic.specification;

import com.epam.books.logic.FieldBook;
import com.epam.books.logic.specification.Specification;

public class SpecificationFactory {
    public Specification create(FieldBook fieldBook){
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
