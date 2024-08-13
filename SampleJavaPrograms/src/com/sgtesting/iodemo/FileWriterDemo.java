package com.sgtesting.iodemo;

import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        writeContent();
    }
    private static void writeContent()
    {
        FileWriter fw=null;
        try
        {
            fw=new FileWriter("D:\\Demo\\Test2.txt",true);
            String str="Java is a programming language,";
            str+=" It is used for Application Development.";

            char ch[]=str.toCharArray();

            fw.write(ch);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fw.flush();
                fw.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
