package com.twu.biblioteca;

public class BibliotecaApp {

    private String[] myBooks;

    public static void main(String[] args) {
        String[] initialBooks = {"A Tale of Two Cities", "Head First Java"};
        BibliotecaApp app = new BibliotecaApp(initialBooks);
        System.out.println(app.welcome());
        System.out.println(app.getBooks());

    }

    public BibliotecaApp(String[] bookList) {
        myBooks = bookList;
    }

    public String getBooks(){
        String finalBookList = "";

        for (int i = 0; i < myBooks.length; i++){
            finalBookList += myBooks[i];
            if(i != myBooks.length - 1){
                finalBookList += ", ";
            }
        }
        return finalBookList;
    }
    public String welcome() {
        return "Welcome to Bangalore Public Library!";
    }
}
