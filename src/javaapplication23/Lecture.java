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
public class Lecture {
    private int lectId;
    private List<Course> courses;
    private List<Message> message;
    
     public void setLectId(int id){
        this.lectId=id;
    }
    public void setCourse(Course course){
      List<Course> courses = new ArrayList<Course>();
      courses.add(course);
    }
    public int getLectId(){
        return lectId;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public List<Message> getMessage(){
        return message;
    }
    
     public boolean login(String credentials){
        String orgCredentials="Pass";
        return credentials.equals(orgCredentials)?true:false;
    }
     
   public void updateContent(Course course,String content){
       course.addContent(content);
       System.out.println("Course Content Uploaded to: "+ course);
   }
   
   public void publishGrade(Course course, String grade){
       course.addGrade(grade);
        System.out.println("Course Grades Updated to: "+ course);
   }
   
   public boolean addStudentToCourse(Course course, Student student){
       course.addStudent(student);
       return true;
   }
   
   public List<Message> getMessages(){
       return message;
   }
}
