package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;


public class TestEducator {
    @Test
    public void testImp(){
        for(Educator educator:Educator.values()){
            Assert.assertTrue(educator instanceof Teacher);
        }
    }
    @Test
    public void testLecture(){
        Classroom classroom = Classroom.getInstance();
        for(Educator educator:Educator.values()){
            classroom.hostLecture(educator,5.5);
        }
        double expected = 5.5;
        Map sm = classroom.getStudyMap();

        for(Student student:classroom.students){
            Assert.assertEquals(sm.get(student),expected);
            System.out.println("Working");
        }
//        Assert.assertTrue(false);


    }
}
