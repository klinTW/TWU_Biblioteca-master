package com.twu.biblioteca;

import org.junit.*;

import static org.junit.Assert.*;

public class BibliotecaTest {

    @Test
    public void testReturnsSingleBook() {
        BibliotecaApp testApp = new BibliotecaApp();
        String testBook= "A Tale of Two Cities";
        assertEquals(testApp.getBooks(), testBook);
    }

    @Test
    public void testReturnsCorrectWelcomeMessage() {
        BibliotecaApp testApp = new BibliotecaApp();
        assertEquals(testApp.welcome(), "Welcome to Bangalore Public Library!");
    }

    @Test
    public void test() {
        assertTrue(true);
    }
}
