package com.klef.fsad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klef.fsad.model.Student;

public class MainAppXML 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = 
        new ClassPathXmlApplicationContext("applicationContext.xml");

        Student s = (Student) context.getBean("student");

        s.display();
    }
}