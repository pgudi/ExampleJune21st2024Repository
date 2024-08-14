package com.sgtesting.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    String firstName;
    String jobName;
    int salary;
    String departmentName;

    Employee(String firstName,String jobName,int salary,String departmentName)
    {
        this.firstName=firstName;
        this.jobName=jobName;
        this.salary=salary;
        this.departmentName=departmentName;
    }

    public void showFN()
    {
        System.out.println("Employee's First Name :"+firstName);
    }

    public void showJobName()
    {
        System.out.println("Employee's Job :"+jobName);
    }

    public void showSalary()
    {
        System.out.println("Employee's Salary:"+salary);
    }

    public void showDeptName()
    {
        System.out.println("Employee's Department Name :"+departmentName);
    }

}
