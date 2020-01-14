package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudentPolymorphism {
    //given
    @Test
    public void testPoly() {
        Student student = new Student(1, "Leon");


        //when
        Boolean isInstanceOfLearner = student instanceof Learner;
        Boolean isInstanceOfPerson = student instanceof Person;

        //then
        Assert.assertTrue(isInstanceOfLearner);
        Assert.assertTrue(isInstanceOfPerson);
    }

}
