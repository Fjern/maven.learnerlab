package com.github.curriculeon;

final class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();
    private Instructors(){
        super();
        Instructor i0 = new Instructor(11, "Leon");
        Instructor i1 = new Instructor(12, "Ali");
        Instructor i2 = new Instructor(13, "Lenny");
        this.add(i0);
        this.add(i1);
        this.add(i2);
    }
    static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return super.personList.toArray(new Instructor[0]);
    }
}
