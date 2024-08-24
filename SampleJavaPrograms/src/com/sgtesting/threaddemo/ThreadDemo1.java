package com.sgtesting.threaddemo;
class MyClass implements Runnable
{

    @Override
    public void run() {
        displayEvenNumbers();
    }

    synchronized void displayEvenNumbers()
    {
        try
        {
            for(int i=20;i<=40;i++)
            {
                Thread.sleep(1000);
                if(i%2==0)
                {
                    System.out.println(Thread.currentThread().getName()+" Even Number :"+i);
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyClass job=new MyClass();

        Thread t1=new Thread(job);
        Thread t2=new Thread(job);

        t1.setName("alpha");
        t2.setName("Omega");
        t1.start();
        t2.start();
    }
}
