package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

class Classroom {
    private static final Classroom INSTANCE = new Classroom();
    Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();

    void hostLecture(Teacher teacher, double hours){
        teacher.lecture(hours,students.toArray());
    }
    void hostLecture(long id, double hours){
        instructors.findByIdea(id).lecture(hours,students.toArray());
    }

    Map<Student,Double> getStudyMap(){
        Map<Student, Double> studyMap = new HashMap<>();
        Student[] stuArray = students.toArray();
        for(Student student:stuArray){
            studyMap.put(student,student.getTotalStudyTime());
        }
        return studyMap;
    }
    static Classroom getInstance(){
        return INSTANCE;
    }
}
