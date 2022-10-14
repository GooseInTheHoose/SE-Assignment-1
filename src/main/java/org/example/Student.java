package org.example;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gusbowyer
 * Class used to generate a new student
 */
public class Student {

    public String name, date, uName, course, modules;
    public int age, id;

    public Student(String fname, int age, String dob, int id, String courses, String modules)
    {
        this.name=fname;
        this.age = age;
        this.date = dob;
        this.id = id;
        this.course = courses;
        this. modules = modules;

    }


    //Method to generate username based on name and age
    public String getUsername(){

        uName = name+age;
        //testing method has worked
        //System.out.println(uName);
        return uName;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDOB(){ return date;}

    public String getCourse(){
        return course;
    }
}
