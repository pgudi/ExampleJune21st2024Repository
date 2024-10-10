package com.sgtesting.actitime.stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksDemo {

    @Before
    public static void initializeDb()
    {
        System.out.println("The Database has connect successfully!!!!");
    }

    @After
    public static void cleanUp()
    {
        System.out.println("The Database has disconnected successfully!!!!");
    }

}
