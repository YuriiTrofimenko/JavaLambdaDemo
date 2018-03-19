/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.lambdademo;

import java.util.List;

/**
 *
 * @author student
 */
public class Student {
    
    public String name;
    public int age;
    public double averageScore;

    public Student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }
    
    /*public static void sort(List<Student> _students){
    
        //students count
        int n = _students.size();
        Student tempStudent = null;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j < (n - i); j++) {
                
                if (_students.get(j - 1).age > _students.get(j).age) {
                    //swap elements  
                    tempStudent = _students.get(j - 1);
                    _students.set(j - 1, _students.get(j));
                    _students.set(j, tempStudent);
                }

            }
        }
    }*/
    
    public static void sort(List<Student> _students, IStudentComare _comarator){
    
        //students count
        int n = _students.size();
        Student tempStudent = null;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j < (n - i); j++) {
                
                if (_comarator.comare(_students.get(j - 1), _students.get(j))) {
                    //swap elements  
                    tempStudent = _students.get(j - 1);
                    _students.set(j - 1, _students.get(j));
                    _students.set(j, tempStudent);
                }

            }
        }
    }

    @Override
    public String toString() {
        return "name: " + name + "; age: " + age + "; avgScore: " + averageScore; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
