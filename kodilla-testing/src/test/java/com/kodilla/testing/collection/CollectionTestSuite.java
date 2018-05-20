package com.kodilla.testing.collection;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    private OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        List<Integer> list = new ArrayList<>();

        //when
        List<Integer> resultEmptyList = new ArrayList<>(oddNumbersExterminator.exterminate(list));

        //then
        System.out.println("Testing Empty List");
        Assert.assertEquals(resultEmptyList.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //given
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //when
        List<Integer> exterminatedNumbers = oddNumbersExterminator.exterminate(numbers);

        //then
        System.out.println("Testing Normal List");
        Assert.assertThat(exterminatedNumbers, CoreMatchers.hasItems(2, 4));

    }
}
