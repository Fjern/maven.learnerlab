//package com.github.curriculeon;
//
//public enum Educ implements Teacher {
//    LEON,
//    ALI,
//    LENNY;
//    private final Instructor instructor;
//    private double timeWorked;
//
//    Educ() {
//        Integer id = this.ordinal();
//        String name = this.name();
//        this.instructor = new Instructor(id.longValue(), name){
//          @Override
//          public void teach(Learner learner, double numberOfHours){
//              Educ.this.timeWorked+=numberOfHours;
//              super.teach(learner, numberOfHours);
//            }
//        };
//        Instructors.getInstance().add(instructor);
//    }
//
//    @Override
//    public void teach(Learner learner, double numberOfHours) {
//        instructor.teach(learner,numberOfHours);
//
//    }
//
//    @Override
//    public void lecture(double numberOfHours, Learner... learner) {
//        instructor.lecture(numberOfHours,learner);
//
//    }
//}
