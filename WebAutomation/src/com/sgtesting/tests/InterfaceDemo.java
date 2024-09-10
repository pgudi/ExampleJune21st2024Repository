package com.sgtesting.tests;
interface University
{
    void showUniversityName(String name);
}

interface College
{
    void showCollegeName(String name);
}

class LVDCollege implements College, University
{
    @Override
    public void showCollegeName(String name) {
        System.out.println("The Engineering College Name :"+name);
    }

    @Override
    public void showUniversityName(String name) {
        System.out.println("The University Name :"+name);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        University vtu=new LVDCollege();
        vtu.showUniversityName("VTU Belguam");

        College clg= (College) vtu;
        clg.showCollegeName("LVD Engineering College");
    }
}
