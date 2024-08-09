package com.sgtesting.exception;
class StringValidation
{
    static int getCharCount(String str) throws Exception
    {
        if(str==null)
        {
            throw new Exception("Please provide valid String as input, null values are not allowed!!");
        }
        return str.length();
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
       try
       {
           int v1=StringValidation.getCharCount("Program");
           System.out.println("# of Char Count :"+v1);
           int v2=StringValidation.getCharCount(null);
           System.out.println("# of Char Count :"+v2);
       }catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
}
