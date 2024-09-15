package com.sgtest.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employee {

    @Test(dataProvider = "empdata")
    public void createEmploye(int empno,String ename,String job,int sal)
    {
        System.out.println(empno+ " >> "+ename+" >> "+job+" >> "+sal);
    }

    @DataProvider(name = "empdata")
    public Object[][] getData()
    {
        return new Object[][] {{10,"Adams","Clerk",2400},
                {11,"Jones","Salesman",3200},
                {12,"Ford","Analyst",2500}
        };
    }
}
