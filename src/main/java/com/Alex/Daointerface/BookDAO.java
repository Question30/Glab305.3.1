package com.Alex.Daointerface;

import com.Alex.model.Books;

import java.sql.SQLException;
import java.util.List;

public interface BookDAO {

    /** This is the method to be used to list down all the records from
     books table* */
    List<Books> getAllBooks() throws ClassNotFoundException, SQLException;

    /** This method to be used top create a record in the books table. */
    void saveBook(List<Books> BookList);

    /** This is the method to be used to delete a record from the
     * Student table corresponding to a passed book id. */
    boolean deleteBook(int id);

    /** This is the method to be used to update a record into the books
     * table */
    boolean updateBook(Books book, int id);
}
