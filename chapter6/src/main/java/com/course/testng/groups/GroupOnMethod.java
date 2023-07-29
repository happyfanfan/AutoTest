package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @BeforeGroups("client")
    public void beforeGroups(){
        System.out.println("执行客户端--BeforeGroups");
    }

    @AfterGroups("client")
    public void afterGroups(){
        System.out.println("执行客户端--AfterGroups");
    }

    @BeforeGroups("server")
    public void beforeServerGroups(){
        System.out.println("执行服务端--BeforeServerGroups");
    }

    @AfterGroups("server")
    public void afterServerGroups(){
        System.out.println("执行服务端--AfterServerGroups");
    }


    @Test(groups = "client",enabled = false)
    public void group3(){
        System.out.println("执行--客户端1");
    }
    @Test(groups = "client")
    public void group4(){
        System.out.println("执行--客户端2");
    }
    @Test(groups = "server")
    public void group1(){
        System.out.println("执行--服务端1");
    }
    @Test(groups = "server",enabled = false)
    public void group2(){
        System.out.println("执行--服务端2");
    }
    @Test(groups = {"server","client"})
    public void group5(){
        System.out.println("执行--客户端3,服务端3");
    }

}
