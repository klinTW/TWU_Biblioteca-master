package com.twu.biblioteca;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by kelin on 4/29/14.
 */
public class BibliotecaTest {
    @Test
    public void test() {
        Librarian testLib = new Librarian();
        assertArrayEquals(testLib.getBooks(),new String[]{"A Tale of Two Cities"});

    }
}
