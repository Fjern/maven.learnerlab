package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestClassroom {
    @Test
    public void testLecture1(){
        //given
        double hours=9;
        Classroom classroom = Classroom.getInstance();
        //when
        classroom.hostLecture(13,hours);
        double expectedTimePerStudent=hours/classroom.students.toArray().length;
        //then
        Map<Student,Double> sM=classroom.getStudyMap();
        for(Student student:classroom.students){
            Assert.assertEquals(sM.get(student),expectedTimePerStudent,.001);
        }
    }
}
