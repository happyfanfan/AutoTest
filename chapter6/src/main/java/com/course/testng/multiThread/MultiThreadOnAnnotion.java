package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    @Test(invocationCount = 5,threadPoolSize = 2,timeOut = 500)
    public void test() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("任务ing~");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

}
