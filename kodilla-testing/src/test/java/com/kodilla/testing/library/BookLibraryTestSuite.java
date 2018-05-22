package com.kodilla.testing.library;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookLibraryTestSuite {

    @Test
    public void testUserListWhenIsEmpty() {
        //given
        final LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        final BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        final LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "000");
        final List<Book> listForTest = new ArrayList<>();

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listForTest);

        //when
        int result = bookLibrary.listBooksInHandsOf(libraryUser).size();

        //then
        assertEquals(0, result);
    }

    @Test
    public void testUserListHasOneBook(){
        //given
        final LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        final BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        final LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "000");
        final List<Book> listForTest = new ArrayList<>();

        listForTest.add(new Book("a", "a", 1990));

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listForTest);

        //when
        int result = bookLibrary.listBooksInHandsOf(libraryUser).size();

        //then
        assertEquals(1, result);
    }

    @Test
    public void testUserListHasFiveBook(){
        //given
        final LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        final  BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        final  LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "000");
        final List<Book> listForTest = new ArrayList<>();

        listForTest.add(new Book("a", "a", 1990));
        listForTest.add(new Book("b", "b", 1991));
        listForTest.add(new Book("c", "c", 1992));
        listForTest.add(new Book("d", "d", 1993));
        listForTest.add(new Book("e", "e", 1994));

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listForTest);

        //when
        int result = bookLibrary.listBooksInHandsOf(libraryUser).size();

        //then
        assertEquals(5, result);
    }
}
