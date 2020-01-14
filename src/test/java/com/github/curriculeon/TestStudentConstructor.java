package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudentConstructor {
    private void test(long expectedId, String expectedName) {
        Person person = new Person(expectedId,expectedName);

//when
        long actualID = person.getId();
        String actualName =person.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId,actualID);
    }
    @Test
    public void test0() {
        test(1,"Leon");
    }

    @Test
    public void test1() {
        test(2,"Hunter");
    }

    @Test
    public void test2() {
        test(1000000,"Ali");
    }


}
