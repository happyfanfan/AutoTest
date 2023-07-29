package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = {"stu","teacher"})
public class GroupsOnClass4 {

    public void stu1(){
        System.out.println("GroupsOnClass4中的stu1111运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass4中的stu2222运行");
    }
}
