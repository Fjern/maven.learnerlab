package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //given
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(1,"Fernando");
        people.add(person);
        //when
        Boolean containsP = people.contains(person);
        //then
        Assert.assertTrue(containsP);
    }
    @Test
    public void testRemove(){
        //given
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(1,"Fernando");
        people.add(person);
        people.remove(person);
        //when
        Boolean containsP = people.contains(person);
        //then
        Assert.assertTrue(!containsP);
    }
    @Test
    public void testRemoveAll(){
        //given
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(1,"Fernando");
        Person person1 = new Person(2,"Ryan");
        people.add(person);
        people.add(person1);
        people.removeAll();
        //when
        int check = people.count();
        //then
        Assert.assertEquals(0,check);
    }
    @Test
    public void testSearchByID(){
        //given
        People people = new People() {
            @Override
            public Person[] toArray() {
                return new Person[0];
            }
        };
        Person person = new Person(1,"Fernando");
        Person person1 = new Person(2,"Ryan");
        people.add(person);
        people.add(person1);

        //when

        Person check = people.findByIdea(2);
        //then
        Assert.assertEquals(person1,check);
    }

}
