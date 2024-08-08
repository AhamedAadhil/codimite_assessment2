/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AADHIL
 */
public class Student {
    private int studentId;
    private List<Course> courses;
    private Message message;
    
    public void setStudentId(int id){
        this.studentId=id;
    }
    public void setMessage(Message content){
        this.message=content;
    }
    public void setCourse(Course course){
      List<Course> courses = new ArrayList<Course>();
      courses.add(course);
    }
    public int getStudentId(){
        return studentId;
    }
    public List<Course> getCourses(){
        return courses;
    }
    
//    public Student(int studentId, List<Course> courses){
//        this.studentId=studentId;
//        this.courses=courses;
//    }
    
    public boolean login(String credentials){
        String orgCredentials="Pass";
        return credentials.equals(orgCredentials)?true:false;
    }
    
    public void submitQuestion(String content, Lecture lecture){
        message.setContent(content,lecture);
        System.out.println("Question "+content+"was submitted to "+lecture);
    }
}
