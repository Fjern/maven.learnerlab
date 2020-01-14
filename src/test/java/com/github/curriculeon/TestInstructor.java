package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(1,"Leon");

        //when
        Boolean isInstanceOfTeacher = instructor instanceof Teacher;
        Boolean isInstanceOfPerson = instructor instanceof  Person;

        //Then
        Assert.assertTrue(isInstanceOfPerson);
        Assert.assertTrue(isInstanceOfTeacher);
    }

    private void testTeach(double expectedTime){
        //given
        Instructor instructor = new Instructor(1,"Leon");
        Student student = new Student(2, "Fernando");
//        double expectedTime = 1.5;
        //when
        instructor.teach(student,expectedTime);
        double actualTime = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(actualTime,expectedTime,.001);

    }
    @Test
    public void testTeach0(){testTeach(1.5);}
    @Test
    public void testTeach1(){testTeach(3.11);}
    @Test
    public void testTeach2(){testTeach(2.42);}

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(1,"Leon");

        Student student0 = new Student(2, "Fernando");
        Student student1 = new Student(3, "Ryan");
        Student student2 = new Student(4, "Chris");

        Student students[] = {student0,student1,student2};

        double numHours = 6.5;

        //when
        instructor.lecture(numHours,students);
        double expectedLearn = numHours/students.length;

        //then
        for(Student student:students ){
            Assert.assertEquals(student.getTotalStudyTime(),expectedLearn,.001);
        }


    }
}
