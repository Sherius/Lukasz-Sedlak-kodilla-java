package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library of books");
        Book book1= new Book("Book1", "Author1", LocalDate.of(2001,02,01));
        Book book2= new Book("Book2", "Author1", LocalDate.of(1999,02,01));
        Book book3= new Book("Book3", "Author1", LocalDate.of(2000,02,01));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);;
        }
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        //When

        library.getBooks().remove(book1);
        //Then

        Assert.assertEquals(2, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }
}
