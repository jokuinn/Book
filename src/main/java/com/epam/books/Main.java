package com.epam.books;

import com.epam.books.data.DataExeption;
import com.epam.books.logic.BookDao;
import com.epam.books.logic.FieldBook;
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
        //get data
        BookDao bookDao = new BookDao();

        bookDao.addBooks();
        bookDao.addBook(BookDao.METRO);
        bookDao.removeBook(BookDao.HARRY_POTTER);
        bookDao.sortBooksByTag(FieldBook.AUTHOR);

        int searchYear = 1997;
        bookDao.findByTag(FieldBook.YEAR, searchYear);

        LOGGER.info("finish");

    }




}
