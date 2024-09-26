package org.example.calculator.sourcecode;

public class Calculator {
    /**
     * Name: addition
     */
    public int addition(int number1,int number2)
    {
        return (number1 + number2);
    }

    /**
     * Name: Subtraction
     */
    public int Subtraction(int number1,int number2)
    {
        return number1 - number2;
    }

    /**
     *
     * Name: division
     */
    public int division(int number1, int number2)
    {
        return number1/number2;
    }

    /**
     *
     * Name: multiplication
     */
    public int multiplication(int number1, int number2)
    {
        return number1 * number2;
    }

    /**
     * Name: Add more Numbers
     */
    public int addition(int arr[])
    {
        int sum=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            sum+=arr[i];
        }
        return sum;
    }

    /**
     * Name: Multiply more Numbers
     */
    public int multiplication(int arr[])
    {
        int result=1;
        for (int i=arr.length-1;i>=0;i--)
        {
            result+=result+arr[i];
        }
        return result;
    }
}
