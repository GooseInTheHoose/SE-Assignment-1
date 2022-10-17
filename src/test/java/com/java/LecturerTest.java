package com.java;

import org.example.Lecturer;
import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LecturerTest {

    private Lecturer l1 = new Lecturer("Johnny Burns", 64, "28/09/1957", 007,"maths, geometry");


    @Test
    void getName(){
        assertEquals("Johnny Burns", l1.getName());
    }
}
