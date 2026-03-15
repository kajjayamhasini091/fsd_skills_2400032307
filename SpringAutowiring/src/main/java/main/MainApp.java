package com.klef.fsad.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klef.fsad.config.AppConfig;
import com.klef.fsad.model.Student;

public class MainApp 
{

    public static void main(String[] args) 
    {

        ApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        student.display();

    }

}