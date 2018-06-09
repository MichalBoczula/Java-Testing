package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3){
            return bookList;
        }

        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (resultList.size() > 20){
            return bookList;
        }

        bookList = resultList;

        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        boolean result = checkUserIdInDatabase(libraryUser);
        List<Book> bookList = new ArrayList<Book>();
        if(result){
            return libraryDatabase.listBooksInHandsOf(libraryUser);
        }

        return bookList;
    }

    private boolean checkUserIdInDatabase(LibraryUser libraryUser){
        List<String> usersID= new ArrayList<>();
        boolean result = false;

        usersID.add("000");
        usersID.add("001");
        usersID.add("002");

        if(usersID.contains(libraryUser.getPeselId())){
            result = true;
        }

        return result;
    }

}
