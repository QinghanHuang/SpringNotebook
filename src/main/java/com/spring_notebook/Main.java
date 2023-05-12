package com.spring_notebook;

import com.spring_notebook.bean.Card;
import com.spring_notebook.bean.Student;
import org.aspectj.weaver.AnnotationOnTypeMunger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student)context.getBean("student");
        Student student1 = (Student)context.getBean("student");
        //默认是单例模式 prototype 非单例
        System.out.println(student==student1);
        System.out.println(student);
        Card card=(Card)context.getBean("cardTest");
        System.out.println(card);

    }
}
