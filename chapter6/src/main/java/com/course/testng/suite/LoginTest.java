package com.course.testng.suite;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(enabled = true)
    public void loginTaobao(){
        System.out.println("执行--loginTaobao");
    }
    @Test(enabled = false)
    public void loginTaobao2(){
        System.out.println("执行--loginTaobao222");
    }
}
