package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> booksSet = new HashSet<Book>();
        Book book1 = new Book("Steven", "Newmack", 1987, "Class A");
        Book book2 = new Book("Fact and Fancy", "Isaac Asimov", 1962, "Class B");
        Book book3 = new Book("Surprise Me: A Novel", "Sophie Kinsella", 2018, "Class C");
        Book book4 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 2017, "Class D");
        Book book5 = new Book("Ready Player One", "Ready Player One", 2011, "Class E");
        Book book6 = new Book("Hotbloods", " Bella Forrest", 2006, "Class F");
        Book book7 = new Book("A Brief History of Time", " Stephen Hawking", 1998, "Class G");
        Book book8 = new Book("Fahrenheit 451", "Fahrenheit 451", 2012, "Class H");
        MedianAdapter medianAdapter = new MedianAdapter();

        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);
        booksSet.add(book6);
        booksSet.add(book7);
        booksSet.add(book8);

        //When
        int median = medianAdapter.publicationYearMedian(booksSet);
        System.out.println("Mediana = " +median);

        //Then
        assertEquals(median, 2011);
    }
}
