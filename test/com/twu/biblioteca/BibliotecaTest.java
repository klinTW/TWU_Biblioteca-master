package com.twu.biblioteca;

import org.junit.*;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {

    BibliotecaApp testApp;
    PrintStream pStream = mock(PrintStream.class);
    AppInterface testInter = new AppInterface(pStream);


    @Test
    public void testReturnsSingleBook() {
        String[] seedBook = {"A Tale of Two Cities"};
        testApp = new BibliotecaApp(seedBook, pStream);
        testApp.getBooks();
        verify(pStream).println("A Tale of Two Cities");
    }

    @Test
    public void testReturnsCorrectWelcomeMessage() {
        String[] seedBook = {"A Tale of Two Cities"};
        testApp = new BibliotecaApp(seedBook, pStream);
        testApp.welcome();
        verify(pStream).println("Welcome to Bangalore Public Library!");
    }

    @Test
    public void testReturnsMultipleBooks() {
        String[] seedBooks = {"A Tale of Two Cities", "Head First Java"};
        testApp = new BibliotecaApp(seedBooks, pStream);
        testApp.getBooks();
        String testBooks = "A Tale of Two Cities, Head First Java";
        verify(pStream).println(testBooks);
    }
/*
    @Test
    public void testInterfaceProvidesPromptText() {
        //PrintStream mockPStream = mock(PrintStream.class);
        assertEquals(testInter.getPrompt(), "Please select an option from the list:");

    }

    @Test
    public void testInterfaceOutputsAvailbleOptions(){
        assertEquals(testInter.getOptions(), "{1. List of Books}");
    }

    @Test
    public void testInterfaceGivesBooksWhenGiven1() {
        testInter.doCommand("1");
        assertEquals(testApp.getBooks(), );
    }*/

    @Test
    public void test() {
        assertTrue(true);
    }
}
