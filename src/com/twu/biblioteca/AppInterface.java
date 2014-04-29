package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by kelin on 4/29/14.
 */
public class AppInterface {

    private PrintStream appPStream;

    public void getPrompt() {
        appPStream.println("Please select an option from the list:");
    }

    public void getOptions() {
        appPStream.println("{1. List of Books}");
    }

    public AppInterface(PrintStream pStream){
        appPStream = pStream;
    }

    public void doCommand(String s) {
    }
}
