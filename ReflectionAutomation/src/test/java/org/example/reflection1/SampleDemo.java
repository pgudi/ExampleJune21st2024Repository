package org.example.reflection1;

import java.lang.reflect.Method;

public class SampleDemo {
    public static void main(String[] args) {
        Sample obj=new Sample();
        try
        {
            Method[] methods=obj.getClass().getMethods();
            for(int i=0;i<methods.length;i++)
            {
                String name=methods[i].getName();
                System.out.println(name);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
