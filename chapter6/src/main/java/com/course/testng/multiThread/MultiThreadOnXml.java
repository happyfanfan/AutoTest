package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("MultiThreadOnXml-test1 ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("MultiThreadOnXml-test2 ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("MultiThreadOnXml-test3 ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("MultiThreadOnXml-test4 ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test5(){
        System.out.printf("MultiThreadOnXml-test5 ++++ Thread Id : %s%n",Thread.currentThread().getId());
    }

}
