package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
    //Given
        Library library = new Library("Library number 1");
        Book book = new Book("Java", "Adrian", LocalDate.of(2018,4,7));
        Book book1 = new Book("Hobbit, czyli tam i z powrotem", "J.R.R. Tolkien", LocalDate.now());
        Book book2 = new Book("Catching Fire", "Catching Fire", LocalDate.of(2013,6,4));
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);


    // When
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

    //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
