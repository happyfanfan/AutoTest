package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("执行-------BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("执行-------AfterSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("执行-----beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("执行-----afterTest");
    }
}
