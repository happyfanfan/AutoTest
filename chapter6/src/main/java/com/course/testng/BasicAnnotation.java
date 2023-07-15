package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void test1(){
        System.out.println("ceshi1");
    }
    @Test
    public void test2(){
        System.out.println("ceshi2");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("ceshi--BeforeMethod");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("ceshi--AfterMethod");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("ceshi--BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("ceshi--AfterClass");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("ceshi--BeforeSuite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("ceshi--AfterSuite");
    }
}
