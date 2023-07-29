package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name =" + name +"; age=" + age);
        System.out.printf("testDataProvider ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };

        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test111方法 name="+name+";age="+age);
        System.out.printf("testDataProvider-test111方法 ++++ Thread Id : %s%n",Thread.currentThread().getId());

    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test222方法 name="+name+";age="+age);
        System.out.printf("testDataProvider-test222方法 ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"test1-zhangsan",20},
                    {"test1-lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"test2-wangwu",50},
                    {"test2-zhaoliu",60}
            };
        }

        return result;
    }



}
