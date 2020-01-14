package com.github.curriculeon;

public interface Teacher {
    void teach(Learner learner, double numberOfHours);
    void lecture(double numberOfHours, Learner... learner);
}
