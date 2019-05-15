/*Q4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk

*/

package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArraySetupTest {
    ArraySetup as;

    @Before
    public void setup()
    {
        //arrenge
        as = new ArraySetup();
    }

    @After
    public void tearDown()
    {
        //arrenge
        as= null;
    }
    @Test
    public void placeTest() throws Exception
    {
        String [] s1={"India", "United States", "Germany","Egypt","Czechoslovakia"};
        String[] result = as.place(s1);
        String[] expected ={"Ind", "Untd Stts", "Grmny","Egypt","Czchslvk"};
        assertArrayEquals(expected, result);

    }



}