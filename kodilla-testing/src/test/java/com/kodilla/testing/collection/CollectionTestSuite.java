package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Numbers: begin");
    }
    @AfterClass
    public static void afterClass() {
            System.out.println("Test Numbers: end");
    }
    @Before
    public void before() {
        System.out.println("Test start");
    }
    @After
    public void after(){
        System.out.println("Test ends");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<Integer>();
        OddNumbersExterminator.exterminate(list);
        //int length = list.size();
        //System.out.println(length);
        //OddNumbersExterminator.exterminate();

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(55);
        list.add(4);
        OddNumbersExterminator.exterminate(list);

    }





}
