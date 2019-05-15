/*Q3. Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the grades of each of the students and saves them in an int array called stuGrades. Your program shall check that the grade is between 0 and 100 else has to throw an error message.
*/

package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;

public class StudentMarksTest
{

    StudentMarks sm;

    @Before
    public void setup()
    {
        //arrenge
        sm = new StudentMarks();
    }

    @After
    public void tearDown()
    {
        //arrenge
        sm = null;
    }

    @Test
    public void StudentsTest(){
        int numOfStudents=5;
        int[] grades={40,92,18,50,60};
        String expected="True";
        String actual=sm.Students(numOfStudents,grades);
        assertEquals(expected,actual);
    }

    @Test
    public void Students1Test()
    {
        int numOfStudents=5;
        int[] grades={32,53,121,50,60};
        String expected="Error:Input Should be less than 100";
        String actual=sm.Students(numOfStudents,grades);
        assertEquals(expected,actual);
    }

    @Test
    public void Students2Test()
    {
        int numOfStudents=4;
        int[] grades={32,-3,26,12};
        String expected="Error:Input should be greater than 0";
        String actual=sm.Students(numOfStudents,grades);
        assertEquals(expected,actual);
    }
}