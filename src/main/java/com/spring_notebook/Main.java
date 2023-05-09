package com.spring_notebook;

import com.spring_notebook.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/8 22:24
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //这里通过文件路径获取 spring 配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student = (Student)context.getBean("student");
        Student student1 = (Student)context.getBean("student");
        //默认是单例模式 prototype 非单例
//        System.out.println(student==student1);
        System.out.println(student);

    }
}
