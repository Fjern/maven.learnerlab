package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudentLearn {
//given
private void test(double expectedHours){
    Student student = new Student(1,"Leon");


    //when
    student.learn(expectedHours);
    double actualTime = student.getTotalStudyTime();

    //then
    Assert.assertEquals(actualTime,expectedHours,.001);

}
    @Test
    public void test0(){test(6.0);}
    @Test
    public void test1(){test(8.7);}
    @Test
    public void test2(){test(3.11);}

}
