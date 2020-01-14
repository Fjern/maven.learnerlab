package com.github.curriculeon;

final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();
    private Students(){
        super();
        Student student0 = new Student(2, "Fernando");
        Student student1 = new Student(3, "Ryan");
        Student student2 = new Student(4, "Chris");
        this.add(student0);
        this.add(student1);
        this.add(student2);
    }
    static Students getInstance(){
        return INSTANCE;
    }
    public int count(){
        return this.toArray().length;
    }
    @Override
    public Student[] toArray() {
        return super.personList.toArray(new Student[0]);
    }
}
