/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;
import java.util.*;

/**
 *
 * @author gusbo
 *  module name, id (e.g.CT417), list of students, courses it is associated with, and lecturer responsible
 */
public class Module {



    public String mName, dob, uName, modules;
    public int age, id;
    public List<Student> sList = new ArrayList<Student>();

    void createModule(String name, int id, String dob, String mods)
    {
        this.mName=name;
        this.id = id;
        this.dob = dob;

        this.modules = mods;
    }

    public String getmName() {
        return mName;
    }

    public String getDob() {
        return dob;
    }

    public String getuName() {
        return uName;
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

    public List<Student> getsList() {
        return sList;
    }








//    List<String> sList = new ArrayList<Student>();
//    sList.add(s1);

}
