package com.sgtesting.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        writeContent();
    }

    private static void writeContent()
    {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try
        {
            fw=new FileWriter("D:\\Demo\\Test3.txt",true);
            bw=new BufferedWriter(fw);

            bw.write("String is a immutable and it never accept changes.");
            bw.newLine();
            bw.write("StringBuffer is thread safe ,it means it is synchronized.");
            bw.newLine();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                bw.flush();
                bw.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
