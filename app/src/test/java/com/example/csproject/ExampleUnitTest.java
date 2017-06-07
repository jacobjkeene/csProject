package com.example.csproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void subtraction_isCorrect() throws Exception {
        assertEquals(2, 4 - 2);
    }

    @Test
    public void isLess() throws Exception {
        assertTrue(-1 < 0);
    }

    @Test
    public void isGreater() throws Exception {
        assertTrue(1 > 0);
    }

    @Test
    public void multiplication_isCorrect() throws Exception {
        assertEquals(8, 4 * 2);
    }

    @Test
    public void division_isCorrect() throws Exception {
        assertEquals(2, 8 / 4);
    }
}