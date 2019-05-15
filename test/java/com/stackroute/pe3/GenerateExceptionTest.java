/*Q6. Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.

 */

package com.stackroute.pe3;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class GenerateExceptionTest {

    public static GenerateException obj;

    @BeforeClass
    public static void setup()
    {
        obj = new GenerateException();

    }

    @AfterClass
    public static void teardown()
    {
        obj = null;

    }

    @Test
    public void NegArrayTest(){
        int arr[]={2,4,1,8,3,9,10};
        String expected="NegativeArraySizeException";
        String result=obj.NegArray(arr);
        assertEquals(expected,result);

    }


    @Test
    public void IndexOutTest(){

        int arr[]={2,4,1,8,3,9};
        String expected="IndexOutOfBoundsException";
        String result=obj.IndexOut(arr);
        assertEquals(expected,result);
    }

    @Test
    public void NullPointTest() {

        String s = null;

        String expected = "NullPointerException";
        String result = obj.NullPoint(s);
        assertEquals(expected, result);
    }

}