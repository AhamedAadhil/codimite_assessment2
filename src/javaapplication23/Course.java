/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.List;

/**
 *
 * @author AADHIL
 */
public class Course {
    int id;
    Lecture lecture;
    List<Student> students;
    String Grade;
    
    public Course(int id, Lecture lecture, Student student){
        this.id=id;
        this.lecture=lecture;
        students.add(student);
    }
    void setLecture(Lecture lecture){
        this.lecture=lecture;
    }

    void addContent(String content) {
        System.out.println("Content Added");
    }

    void addStudent(Student student) {
      students.add(student);
    }

    void addGrade(String grade) {
      this.Grade=grade;
    }

    
}
