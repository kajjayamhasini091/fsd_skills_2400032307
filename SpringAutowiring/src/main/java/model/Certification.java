package com.klef.fsad.model;

import org.springframework.stereotype.Component;

@Component
public class Certification 
{

    private int id = 501;
    private String name = "Java Certification";
    private String dateOfCompletion = "15-Mar-2026";

    public void display()
    {
        System.out.println("Certification ID: " + id);
        System.out.println("Certification Name: " + name);
        System.out.println("Completion Date: " + dateOfCompletion);
    }

}