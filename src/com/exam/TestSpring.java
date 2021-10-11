/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import java.util.ArrayList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class TestSpring {

    public static void main(String[] args) {
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:com/exam/appConfig.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/exam/appConfig.xml");
        StudentDao dao = (StudentDao) ctx.getBean("dao");
        //insert
        //Student s = new Student(101, "abc", "abc@gmail.com");
        //dao.doAdd(s);
        //update
        //Student s2 = new Student(100, "xyz", "xyz@gmail.com");
        //dao.doUp(s2);
        //delete
        //Student s3 = new Student(101, "abc", "abc@gmail.com");
        //dao.doDel(s3);
        ArrayList<Student> list = (ArrayList<Student>) dao.allStudent();
        for (Student student : list) {
            System.out.println(student.getId() +"   "+student.getName() +"   "+ student.getEmail());
            
        }
    }
}
