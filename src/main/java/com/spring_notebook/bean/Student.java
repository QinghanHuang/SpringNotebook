package com.spring_notebook.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/8 22:26
 * @Desc
 * @Version 1.0
 */
@Component
@ToString

public class Student {
    String name="QQQ";
    int age;

    @Resource(name="cardTest")
    Card card;

    List<Double> list;
    Map<String,Integer> map;

    public Student() {
//        System.out.println("Use no args constructor");
    }


    public int AOPTest(String str){
        System.out.println("This is AOP test method");
        return str.length();

    }

    private void init() {
//        System.out.println("我是初始化方法！");
    }

    private void destroy() {
        System.out.println("我是销毁方法！");
    }

}

