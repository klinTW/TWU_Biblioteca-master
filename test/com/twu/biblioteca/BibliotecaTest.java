package com.twu.biblioteca;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by kelin on 4/29/14.
 */
public class BibliotecaTest {
    @Test
    public void testReturnsCorrectListOfBooks() {
        Librarian testLib = new Librarian();
        assertArrayEquals(testLib.getBooks(),new String[]{"A Tale of Two Cities"});
    }

    @Test
    public void testReturnsCorrectWelcomeMessage() {
        BibliotecaApp testApp = new BibliotecaApp();
        assertEquals(testApp.welcome(), "Welcome to Bangalore Public Library!");
    }
}
