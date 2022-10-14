/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

/**
 *
 * @author gusbo
 * Name, Age, DOB, ID, username, and modules teaching,
 */
public class Lecturer {



    public String name, dob, uName, modules;
    public int age, id;

    void createLecturer(String fname, int age, String dob, int id, String mods)
    {
        this.name=fname;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.modules = mods;
    }

    //Specific method to generate username based on name and age
    String getUsername(){

        uName = name+age;
        return uName;
        //testing specific method has worked
        //System.out.println(uName);
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getModules() {
        return modules;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }


}
