package com.github.curriculeon;

public class Student extends Person implements Learner {
    private double totalStudyTime = 0;

    public Student(long id, String name) {
        super(id, name);
    }
    public Student(){super(0,"");}

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        double time = this.getTotalStudyTime();
        time+=numberOfHours;
        this.setTotalStudyTime(time);
    }

    @Override
    public double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
