package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BibliotecaApp {

    private String[] myBooks;
    private PrintStream myPStream;
    private BufferedReader myReader;
    private AppInterface myInterface;

    public static void main(String[] args) {
        String[] initialBooks = {"A Tale of Two Cities", "Head First Java"};
        PrintStream pStream = new PrintStream(System.out);
        BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
        BibliotecaApp app = new BibliotecaApp(initialBooks, pStream);
        AppInterface inter = new AppInterface(app, pStream, inStream);
        app.welcome();
        inter.getPrompt();
        inter.getOptions();
        inter.inputLine();
    }

    public BibliotecaApp(String[] bookList, PrintStream pStream) {
        myBooks = bookList;
        myPStream = pStream;
    }

    public void getBooks(){
        String finalBookList = "";

        for (int i = 0; i < myBooks.length; i++){
            finalBookList += myBooks[i];
            if(i != myBooks.length - 1){
                finalBookList += ", ";
            }
        }
        myPStream.println(finalBookList);
    }
    public void welcome() {
        myPStream.println("Welcome to Bangalore Public Library!");
    }
}
