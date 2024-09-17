package org.example.reflection3;

import java.lang.reflect.Method;

public class SampleDemo {
    public static void main(String[] args) {
        Sample obj=new Sample();
        try
        {
            Method[] methods= obj.getClass().getDeclaredMethods();
            for(int i=0;i<methods.length;i++)
            {
                String name=methods[i].getName();
                methods[i].invoke(obj);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
