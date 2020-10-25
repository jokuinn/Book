package com.epam.books;

import com.epam.books.data.DataExeption;
import com.epam.books.logic.BookDao;
import com.epam.books.logic.BookFieldType;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e){
            LOGGER.error(e.getMessage(), e);
        }

    }

    private static void process() throws DataExeption {
        LOGGER.info("start Main");

        LOGGER.info("Create BookDao and add books");
        BookDao bookDao = new BookDao();
        bookDao.addBooks();

        LOGGER.info("Add book Metro");
        bookDao.addBook(BookDao.METRO);

        LOGGER.info("Remove book");
        bookDao.removeBook(BookDao.HARRY_POTTER);

        LOGGER.info("Sort books by author");
        bookDao.sortByTag(BookFieldType.AUTHOR);

        LOGGER.info("Find book by tag year");
        int searchYear = 1997;
        bookDao.findByTag(BookFieldType.YEAR, searchYear);

        LOGGER.info("finish");

    }




}
