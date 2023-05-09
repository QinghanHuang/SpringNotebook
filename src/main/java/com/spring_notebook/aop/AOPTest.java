package com.spring_notebook.aop;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/9 22:47
 * @Desc
 * @Version 1.0
 */
public class AOPTest {
    public void before(){
        System.out.println("This is before method");
    }
    public void after(){
        System.out.println("This is after method");
    }
}
