package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void test1(){
        System.out.println("ceshi1+++");
        System.out.printf("BasicAnnotation-ceshi1 ++++ Thread Id : %s%n",Thread.currentThread().getId());

    }
    @Test
    public void test2(){
        System.out.println("ceshi2+++:");
        System.out.printf("BasicAnnotation-ceshi2 ++++ Thread Id : %s%n",Thread.currentThread().getId());

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BasicAnnotation-ceshi--BeforeMethod"+Thread.currentThread().getId());
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("BasicAnnotation-ceshi--AfterMethod"+Thread.currentThread().getId());
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BasicAnnotation-ceshi--BeforeClass"+Thread.currentThread().getId());
    }
    @AfterClass
    public void afterClass(){
        System.out.println("BasicAnnotation-ceshi--AfterClass"+Thread.currentThread().getId());
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BasicAnnotation-ceshi--BeforeSuite"+Thread.currentThread().getId());
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("ceshi--AfterSuite");
        System.out.printf("BasicAnnotation-ceshi ++++ Thread Id : %s%n",Thread.currentThread().getId());

    }
}
