package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    private String[] myBooks;
    private PrintStream myPStream;

    public static void main(String[] args) {
        String[] initialBooks = {"A Tale of Two Cities", "Head First Java"};
        PrintStream pStream = new PrintStream(System.out);
        BibliotecaApp app = new BibliotecaApp(initialBooks, pStream);
        app.welcome();
        app.getBooks();
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
