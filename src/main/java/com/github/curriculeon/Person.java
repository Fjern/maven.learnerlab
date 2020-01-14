package com.github.curriculeon;

public class Person<SomePerson extends Person> {
    private final long id;
    private String name;


    public Person(long id, String name) {
        this.id = id;
        this.setName(name);
    }

    private void setName(String name) {
        this.name=name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
