package com.course.testng.suite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PayTest {
    @Test
    public void payOK(){
        System.out.println("执行--payOK");
    }
    @Test
    public void payOKLa(){
        System.out.println("执行--payOKLa");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("执行Pay-----beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("执行Pay-----afterTest");
    }
}
