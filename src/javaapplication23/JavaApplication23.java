/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AADHIL
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lecture lecture1 = new Lecture();
        Student student1 = new Student();
        Course DBMS = new Course(10,lecture1,student1);
        student1.setCourse(DBMS);
        student1.setStudentId(10);
        
       
    }
    
}
