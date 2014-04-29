package com.twu.biblioteca;

import org.junit.*;

import static org.junit.Assert.*;

public class BibliotecaTest {

    BibliotecaApp testApp;

    @Test
    public void testReturnsSingleBook() {
        String[] seedBook = {"A Tale of Two Cities"};
        testApp = new BibliotecaApp(seedBook);
        String testBook= "A Tale of Two Cities";
        assertEquals(testApp.getBooks(), testBook);
    }

    @Test
    public void testReturnsCorrectWelcomeMessage() {
        String[] seedBook = {"A Tale of Two Cities"};
        testApp = new BibliotecaApp(seedBook);
        assertEquals(testApp.welcome(), "Welcome to Bangalore Public Library!");
    }

    @Test
    public void testReturnsMultipleBooks() {
        String[] seedBooks = {"A Tale of Two Cities", "Head First Java"};
        testApp = new BibliotecaApp(seedBooks);
        String testBooks = "A Tale of Two Cities, Head First Java";
        assertEquals(testApp.getBooks(), testBooks);
    }

    @Test
    public void test() {
        assertTrue(true);
    }
}
