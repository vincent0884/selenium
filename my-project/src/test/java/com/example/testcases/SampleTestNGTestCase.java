package com.example.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;		

@Listeners(com.example.utility.ListenerUtil.class)			

public class SampleTestNGTestCase {

    @BeforeMethod
    public void setUp() {
        System.out.println("Setting up test...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down test...");
    }

    @Test(priority = 2)
    public void testAddition() {
        int num1 = 5;
        int num2 = 7;
        int expectedResult = 12;
        int actualResult = num1 + num2;
        Assert.assertEquals(actualResult, expectedResult, "Addition result is not as expected");
    }

    @Test(priority = 1)
    public void testSubtraction() {
        int num1 = 10;
        int num2 = 3;
        int expectedResult = 7;
        int actualResult = num1 - num2;
        Assert.assertEquals(actualResult, expectedResult, "Subtraction result is not as expected");
    }

    @Test(priority=3)
    public void testMultiplication() {

        int num1 = 4;
        int num2 = 6;
        int expectedResult = 24;
        int actualResult = num1 * num2;
        Assert.assertEquals(actualResult, expectedResult, "Multiplication result is not as expected");
    }

    @Test(priority=4)
    public void testDivision() {

        int num1 = 15;
        int num2 = 3;
        int expectedResult = 5;
        int actualResult = num1 / num2;
        Assert.assertEquals(actualResult, expectedResult, "Division result is not as expected");
    }
}
