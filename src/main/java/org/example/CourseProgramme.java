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
