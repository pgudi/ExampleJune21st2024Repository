package com.sgtesting.iodemo;

import java.io.File;

public class FileDetailsDemo {
    public static void main(String[] args) {
        File f=new File("D:\\Demo\\Sample.txt");
        //Display File Name
        String name=f.getName();
        System.out.println("File Name :"+name);
        //Display file Path
        String path1=f.getAbsolutePath();
        System.out.println(path1);
        //Diplay file Path
        File path2=f.getAbsoluteFile();
        System.out.println(path2);
        //Display Folder Path
        String path3=f.getParent();
        System.out.println(path3);
        //Verify whether it is File?
        boolean v1=f.isFile();
        System.out.println("Whether it is a File ?:"+v1);
        //Verify whether it is a Folder?
        boolean v2=f.isDirectory();
        System.out.println("Whether it is a Folder ?:"+v2);
        //Verify read Permission
        boolean v11=f.canRead();
        System.out.println("whether It has read permission?:"+v11);
        //Verify Write Permission
        boolean v12=f.canWrite();
        System.out.println("whether It has write permission?:"+v12);
        //Verify Execute Permission
        boolean v13=f.canExecute();
        System.out.println("whether It has Execute permission?:"+v13);
    }
}
