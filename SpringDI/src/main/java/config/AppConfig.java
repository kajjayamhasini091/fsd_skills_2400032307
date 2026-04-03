package com.klef.fsad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.klef.fsad.model.Student;

@Configuration
public class AppConfig 
{

@Bean
public Student student()
{
    Student s = new Student(102,"Hasini","Java",2);
    s.setCourse("Spring Framework");
    s.setYear(3);
    return s;
}

}