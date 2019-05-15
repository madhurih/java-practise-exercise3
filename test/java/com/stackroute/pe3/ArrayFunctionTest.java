/*Q1: Consider the Following Problem:
You need to create a Java class that accepts an integer array. The class should:
1.    Loop through the array, and for each element, prints to the console whether the number is even or odd.
2.    Loop through the array, and remove all prime numbers.
3.    Reverse the elements of the array.
You need to:
1.    Write the Test Scenarios in Given-Should Format in the README.md under the Header
# PE <pe_number> Problem <prob_number>
Ensure you create scenarios for:
a.    One or more Positive Test Case
b.    One or More Negative Test Cases
c.    One or More Edge Cases

2.    Implement the Test Cases
3.    Write the implementation code
*/

package com.stackroute.pe3;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayFunctionTest
{
    ArrayFunction af;

    @Before
    public void setup() {
        //arrenge
        af = new ArrayFunction();
    }

    @After
    public void tearDown() {
        //arrenge
        af = null;
    }

    @Test
    public void evenOddTest() throws Exception {
        int[] arr = {4, 3, 7, 8};
        String[] result = af.evenOdd(arr);
        String[] expected = {"even", "odd", "odd", "even"};
        assertArrayEquals(expected, result);
    }

    @Test
    public void evenOddTestFailure() throws Exception
    {
        int[] arr = {4, 3, 7, 8};
        String[] result = af.evenOdd(arr);
        assertNotNull(result);
    }


    @Test
    public void removePrimeTest() throws Exception
    {
        int[] arr = {3, 12, 7, 1};
        int[] result = af.removePrime(arr);
        int[] expected = {12, 1};
        assertArrayEquals(result, expected);
    }

    @Test
    public void removePrimeTestFailure() throws Exception
    {
        int[] arr = {3, 12, 7, 1};
        assertNotNull(af.removePrime(arr));

        assertNotEquals("3, 7", af.removePrime(arr));
    }


    @Test
    public void reverseArrayTest() throws Exception
    {

        int[] arr = {4, 3, 7, 8};
        int [] result = af.reverseArray(arr);
        int [] expected = {8, 7, 3, 4};
        assertArrayEquals(expected, result);

    }

    @Test
    public void reverseArrayTestFailure() throws Exception
    {
        int[] arr = {4, 3, 7, 8};
        assertNotNull(af.reverseArray(arr));
        assertNotEquals("4, 3, 7, 8", af.reverseArray(arr));
    }

}
