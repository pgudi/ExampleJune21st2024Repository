package com.sgtest.parameters;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
    @Parameters(value="user")
    @Test
    public void createUser(String user) {
        System.out.println("The User "+user+" has created successfully");
    }

    @Parameters(value="user")
    @Test
    public void modifyUser(String user) {
        System.out.println("The User "+user+" has modified successfully");
    }

    @Parameters(value="user")
    @Test
    public void deleteUser(String user) {
        System.out.println("The User "+user+" has deleted successfully");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("Launch and Navigate the URL and Login into the Application");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Logout from the Application and close Application successfully");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }
}
