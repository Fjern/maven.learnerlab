package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstructors(){
        //given
        Instructors instructors = Instructors.getInstance();
        Students cohort = Students.getInstance();
        for(Instructor ins:instructors){
            ins.lecture(5.5,cohort.toArray());
        }
        //when
        double expectedStudy = 5.5;

        //then
        for(Student stu:cohort){
            Assert.assertEquals(expectedStudy,stu.getTotalStudyTime(),.001);
        }

    }
}
