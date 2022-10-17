package org.example;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

/*
* containing course name (CS & IT or ECE, etc.), list of
modules, list of students that are enrolled, academic start date and end date.
*
* */
public class CourseProgramme {


    public String cName;

    public LocalDate sDate, eDate;
    List<Module> mList = new ArrayList<Module>();
    List<Student> eStudentList = new ArrayList<Student>();

    public CourseProgramme(String cName, LocalDate sDate, LocalDate eDate, List<Module> mList, List<Student> eStudentList) {
        this.cName = cName;
        this.sDate = sDate;
        this.eDate = eDate;
        this.mList = mList;
        this.eStudentList = eStudentList;
    }

    public String getcName() {
        return cName;
    }

    public LocalDate getsDate() {
        return sDate;
    }

    public LocalDate geteDate() {
        return eDate;
    }

    public List<Module> getmList() {
        return mList;
    }

    public List<Student> geteStudentList() {
        return eStudentList;
    }
}
