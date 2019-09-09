package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAvoidOverflowWhenParametersAreMaxValueOfInteger()
    {
        //given
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        //when
        long result = App.add(a, b);
        System.out.println(result);

        //then
        assertEquals(result, (long) Integer.MAX_VALUE * 2);
    }

    @Test
    public void shouldAvoidOverflowWhenParametersAreMinValueOfInteger()
    {
        //given
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;

        //when
        long result = App.add(a, b);
        System.out.println(result);

        //then
        assertEquals(result, (long) Integer.MIN_VALUE * 2);
    }
}
