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
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        Assert.assertEquals(result.size(),0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(4);
        list.add(15);
        list.add(88);
        list.add(1);
        list.add(0);
        list.add(87);
        list.add(60);
        OddNumbersExterminator.exterminate(list);
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        Assert.assertEquals(result.size(),5);
    }





}
