package com.sgtesting.tests;

public class ExecuteAutoItFileDemo {
    public static void main(String[] args) {
        executeFile();
    }

    private static void executeFile()
    {
        try
        {
            Runtime.getRuntime().exec("E:\\GitRepository5\\CurrentWorkSpace\\ExampleJune21st2024Repository\\AutoIT\\WriteContentAndSaveFileDemo.exe");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
