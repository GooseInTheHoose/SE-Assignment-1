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

    public Module(String mName, String dob, String uName, String modules, int age, int id, List<Student> sList) {
        this.mName = mName;
        this.dob = dob;
        this.uName = uName;
        this.modules = modules;
        this.age = age;
        this.id = id;
        this.sList = sList;
    }

    public String getMName() {
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
