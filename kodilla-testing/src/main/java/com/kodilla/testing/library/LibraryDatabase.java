package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    List<Book> listBooksWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentBook(LibraryUser libraryUser, Book book);

    int retuernBooks(LibraryUser libraryUser);
}
