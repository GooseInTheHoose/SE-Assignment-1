package com.java;

import org.example.Student;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {


    private Student s1 = new Student("Jim", 23, "27/07/97", 171, "course 1", "module1" );

    private Student s2 = new Student("John", 24, "18/06/98", 455, "course2", "module 2");

    @Test
    void getUsername(){
        assertEquals("Jim23", s1.getUsername());
    }

    @Test
    void getId()
    {
        assertEquals(171, s1.getId());
    }



}

