package com.spring_notebook.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/10 14:09
 * @Desc
 * @Version 1.0
 */
//更接近动态代理,通过实现的接口,来决定切入点的规则
public class AOPInterface implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(args[0]);
        System.out.println(method);
        System.out.println(target);
        System.out.println("this is advice before");

    }
}
