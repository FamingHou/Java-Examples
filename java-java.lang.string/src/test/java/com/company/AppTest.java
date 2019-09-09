package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void shouldReturnCharAtIndex()
    {
        String helloWorld = "Hello World";
        char firstChar = helloWorld.charAt(0);
        char lastChar = helloWorld.charAt(helloWorld.length() - 1);
        assertEquals('H', firstChar);
        assertEquals('d', lastChar);
    }
}
