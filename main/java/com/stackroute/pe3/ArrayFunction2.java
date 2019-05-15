/*Q2: Consider the Following Problem:
You need to create a Java class that accepts two arrays of String objects, array1 and array2.
1.    Compare the elements of both the arrays
2.    Loop through each array, to remove any duplicate elements.
3.    Append the first element of array1 to array2.
4.    Prepend the mid element of array2 to array1.
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

public class ArrayFunction2
{

    //Compare the elements of both the arrays
    public String Elements(String array1[],String array2[])
    {
        String  result="";
        boolean flag=true;
        for (int i=0;i<array1.length;i++ ){
            flag=array1[i].equals(array2[i]);

            if(flag==false) {
                result = "The array elements in both the arrays are not equal";
                break;
            }
        }
        if (flag==true)
            result="The array elements in both the arrays are equal";

        return result;
    } //end of Elements


    //Loop through each array, to remove any duplicate elements.
    public String[] removeDuplicateElements(String[] str)
    {
        String[] result = new String[str.length-1];
        int i, j, count=0;
        for(i=0; i<str.length; i++)
        {
            for(j=0; j<count; j++)
            {
                if(str[i]==result[j])
                {
                    break;
                }

            }
            if(j==count)
            {
                result[count] = str[i];
                count++;
            }
        }
        return result;
    }//End of removeDuplicateElements


    //Append the first element of array1 to array2.
    public String[] appendFirstElement(String[] s1,String[] s2)
    {
        String[] result = new String[s2.length+1];
        result[0] = s1[0];
        int j=0;
        for (int i=1; i<result.length; i++)
        {
            result[i] = s2[j];
            j++;
        }
        return result;
    }//End of appendFirstElement


    //Prepend the mid element of array2 to array1.
    public String[] prependMidElement(String[] s1, String[] s2)
    {
        String[] result= new String[s1.length+1];
        int pos = s2.length/2,j=0;

        result[0] = s2[pos];

        for (int i=1; i<result.length; i++)
        {
            result[i]=s1[j];
            j=j+1;

        }
        return result;
    }//End of PrependMidElement
}
