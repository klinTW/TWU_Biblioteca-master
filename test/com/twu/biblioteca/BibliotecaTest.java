package com.twu.biblioteca;

import org.junit.*;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {

    BibliotecaApp testApp;
    PrintStream pStream = mock(PrintStream.class);
    BufferedReader inStream = mock(BufferedReader.class);
    AppInterface testInter = new AppInterface(testApp, pStream, inStream);


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

    @Test
    public void testInterfaceProvidesPromptText() {
        testInter.getPrompt();
        verify(pStream).println("Please enter the number for an option from the list:");
    }

    @Test
    public void testInterfaceOutputsAvailbleOptions(){
        testInter.getOptions();
        verify(pStream).println("{1. List of Books}");
    }

    @Test
    public void testInterfaceGivesBooksWhenGiven1() {
        String[] seedBooks = {"A Book Adventure", "A Book About Books"};
        BibliotecaApp testApp = new BibliotecaApp(seedBooks, pStream);
        AppInterface testInter = new AppInterface(testApp, pStream, inStream);

        testInter.doCommand("1");

        verify(pStream).println("A Book Adventure, A Book About Books");
    }

    @Test
    public void test() {
        assertTrue(true);
    }
}
