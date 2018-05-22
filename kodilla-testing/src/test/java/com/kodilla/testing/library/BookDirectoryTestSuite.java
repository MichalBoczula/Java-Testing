package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testUserListWhenIsEmpty() {
        //when
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "000");
        List<Book> listForTest = new ArrayList<>();

        //when
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listForTest);
        int result = bookLibrary.listBooksInHandsOf(libraryUser).size();

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testUserListHasOneBook(){
        //when
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "000");
        List<Book> listForTest = generateListOfNBooks(1);

        //when
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listForTest);
        int result = bookLibrary.listBooksInHandsOf(libraryUser).size();

        //then
        Assert.assertEquals(1, result);
    }

    @Test
    public void testUserListHasFiveBook(){
        //when
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "000");
        List<Book> listForTest = generateListOfNBooks(5);

        //when
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(listForTest);
        int result = bookLibrary.listBooksInHandsOf(libraryUser).size();

        //then
        Assert.assertEquals(5, result);
    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}
