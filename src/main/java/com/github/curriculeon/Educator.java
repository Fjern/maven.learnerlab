package com.github.curriculeon;

public enum Educator implements Teacher {
    LEON,//So each one of these values is a defined enumeration of the enum Educator; an instructor
    ALI,
    LENNY;

    private final Instructor instructor; //seemingly, this holds our current enumeration, I think
    private Double numberofHoursWorked;

    Educator() { // derives state of instructor using Enum methods `name()` and `ordinal()`
        String name = name();//Derives names from the enumerations
        Integer id = ordinal();//Defines ID from the order the enumerations are in
        Instructor instructor = new Instructor(id.longValue(), name) {
            @Override//defers the teach method called by Enum's lecture and teach methods to here, which increments the hours instructed for each enum.
            public void teach(Learner learner, double numberOfHours) {
                Educator.this.numberofHoursWorked += numberOfHours;
                learner.learn(numberOfHours);
            }
        };
        this.instructor = instructor;
        Instructors.getInstance().add(instructor);
    }


    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
    }

    @Override
    public void lecture(double numberOfHours, Learner... learner) {
        instructor.lecture(numberOfHours, learner);
    }

    public Double getNumberofHoursWorked() {
        return numberofHoursWorked;
    }
}
