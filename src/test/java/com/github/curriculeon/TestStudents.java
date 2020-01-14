package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents(){
        //given
        Students students=Students.getInstance();
        Student student0 = new Student(2, "Fernando");
        Student student1 = new Student(3, "Ryan");
        Student student2 = new Student(4, "Chris");
        students.add(student0);
        students.add(student1);
        students.add(student2);
        //when
        Boolean F = students.contains(student0);
        Boolean R = students.contains(student1);
        Boolean C = students.contains(student2);
        //then
        Assert.assertTrue(F);
        Assert.assertTrue(R);
        Assert.assertTrue(C);


    }
}
