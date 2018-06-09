package com.kodilla.stream.main;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.sun.javafx.collections.MappingChange;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args){

//        Processor processor = new Processor();
//        processor.execute(() -> System.out.println("" +
//                "This is an example text."));
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> desc+"ABC"));
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> desc.toUpperCase()));
//        String str = "CBA";
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> desc+str));
//        System.out.println(poemBeautifier.beautify("aaa",(desc)-> "XYZ".toLowerCase()+desc.toUpperCase()));
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);

//        People.getList().stream()
////                .map(s->s.toUpperCase()) can exchange lambda expression with ref to methods
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ') + 2)+ ".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();

//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);


//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));

//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);


//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> (forumUser.getGender().equals('M')))
                .filter(forumUser -> (forumUser.getPostNumber() > 1))
                .filter(forumUser -> (forumUser.getBirthDate() <= 1998))
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser ));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "  + entry.getValue())
                .forEach(System.out::println);
    }
}