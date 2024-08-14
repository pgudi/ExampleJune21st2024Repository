package com.sgtesting.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
    //    readContent1();
        readContent2();
    }

    private static void readContent1()
    {
        FileReader fr=null;
        BufferedReader br=null;
        try
        {
            fr=new FileReader("D:\\Demo\\Sample.txt");
            br=new BufferedReader(fr);

            String sLine=null;
            while((sLine=br.readLine())!=null)
            {
                System.out.println(sLine);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void readContent2()
    {
        FileReader fr=null;
        BufferedReader br=null;
        try
        {
            fr=new FileReader("D:\\Demo\\Sample.txt");
            br=new BufferedReader(fr);

            String sLine1=br.readLine();
            System.out.println(sLine1);

            String sLine2=br.readLine();
            System.out.println(sLine2);

            String sLine3=br.readLine();
            System.out.println(sLine3);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
