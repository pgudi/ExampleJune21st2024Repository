package com.sgtesting.stringdemo;
class Employee
{
    String firstName;
    String jobName;
    Employee(String firstName, String jobName)
    {
        this.firstName=firstName;
        this.jobName=jobName;
    }
    @Override
    public String toString()
    {
       return "Employee First Name "+firstName+" and Job Name "+jobName;
    }
}
public class StringDemo2 {
    public static void main(String[] args) {
        Employee obj=new Employee("Santosh","Doctor");
        System.out.println(obj);
    }
}
