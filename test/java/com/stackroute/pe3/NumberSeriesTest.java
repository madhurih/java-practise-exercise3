/*Q5. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers
 */

package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class NumberSeriesTest {

    public static NumberSeries consecutive;

    @BeforeClass
    public static void setup()
    {
        consecutive = new NumberSeries();

    }

    @AfterClass
    public static void teardown()
    {
        consecutive = null;

    }

    @Test
    public void testConsecutiveNumbers() throws Exception
    {
        int[] num = {10, 11, 12, 13, 14, 15, 16, 17};
        String expected = "consecutive";
        String actual = consecutive.getConsecutiveNumbers(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testConsecutiveNumbers1()throws Exception
    {
        int[] num = {10,20,30,40,50,60};
        String expected = "non consecutive";
        String actual = consecutive.getConsecutiveNumbers(num);
        assertEquals(expected, actual);
    }

     @Test
     public void testConsecutiveNumbers2() throws Exception
     {
         int[] num = {7,6,5,4,3,2,1};
         String expected = "consecutive";
         String actual = consecutive.getConsecutiveNumbers2(num);
         assertEquals(expected, actual);
     }

}