package com.spring_notebook.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/9 22:47
 * @Desc
 * @Version 1.0
 */
public class AOPTest {
    public void before(JoinPoint joinPoint){
        //获得参数,以array的形式储存
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        //getTarget()获得被代理类--既Student
        System.out.println(joinPoint.getTarget().getClass());
        //getThis()获得代理类,时CGlib动态生成的Student代理类
        System.out.println(joinPoint.getThis().getClass());
        System.out.println("This is before method");
    }
    public void after(){
        System.out.println("This is after method");
    }
    //around 完全需要自己执行,并不是前后包裹操作
    //proceed 方法,默认使用原本传入的参数,可以使用object[] 自己定义参数
    //返回值时object 对象,可以转换
    public int around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before");
        int proceed = (int)proceedingJoinPoint.proceed(new Object[]{"wwwww"});
        System.out.println("after");
        System.out.println(proceed);
        return proceed;
    }
}
