package com.sgtesting.iodemo;

import java.io.File;

public class FileOperationsDemo {
    public static void main(String[] args) {
   //     createFile();
  //      renameFile();
   //     deleteFile();
        fileCollections();
    }

    private static void createFile()
    {
        try
        {
            File f1=new File("D:\\Demo\\Hello.txt");
            boolean v1=f1.createNewFile();
            System.out.println("whether File has created ?:"+v1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void renameFile()
    {
        File f1=new File("D:\\Demo\\Hello.txt");
        File f2=new File("D:\\Demo\\HelloWorld.txt");
        boolean v1=f1.renameTo(f2);
        System.out.println("Whether File has renamed ?:"+v1);
    }

    private static void deleteFile()
    {
        File f2=new File("D:\\Demo\\HelloWorld.txt");
        boolean v1=f2.delete();
        System.out.println("whether File has deleted :"+v1);
    }

    private static void fileCollections()
    {
        File f1=new File("D:\\Demo");
        File[] f2=f1.listFiles();
        for(int i=0;i<f2.length;i++)
        {
            if(f2[i].isFile()==true)
            {
                String path=f2[i].getAbsolutePath();
                System.out.println(path);
            }
        }
    }
}
