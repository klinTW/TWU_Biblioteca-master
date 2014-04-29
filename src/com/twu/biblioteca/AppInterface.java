package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by kelin on 4/29/14.
 */
public class AppInterface {

    private BibliotecaApp app;
    private PrintStream appPStream;
    private BufferedReader appInStream;

    public AppInterface(BibliotecaApp testApp, PrintStream pStream, BufferedReader inStream){
        app = testApp;
        appPStream = pStream;
        appInStream = inStream;
    }

    public void getPrompt() {
        appPStream.println("Please enter the number for an option from the list:");
    }

    public void getOptions() {
        appPStream.println("{1. List of Books}");
    }

    public void doCommand(String s) {
        switch (Integer.parseInt(s))
        {
            case 1: app.getBooks();
                break;
        }
    }

    public void inputLine() {
        String in = null;
        try {
            in = appInStream.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        doCommand(in);
    }
}
