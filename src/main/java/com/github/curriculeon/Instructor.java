package com.github.curriculeon;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name) {
        super(id,name);
    }
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(double numberOfHours, Learner... learner) {
        double newTime = numberOfHours/learner.length;
        for(Learner student:learner){
            this.teach(student,newTime);
        }
    }
}
