/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.lambdademo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class LambdaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("John", 20, 9));
        students.add(new Student("James", 17, 10));
        students.add(new Student("Piter", 16, 8));
        students.add(new Student("Julia", 18, 7));
        students.add(new Student("Bill", 21, 11));
        students.add(new Student("Jill", 21, 10));
        
        //Student.sort(students);
        /*Student.sort(students, (s1, s2) -> {

            if (s1.age > s2.age) {
                
                return true;
            } else {
            
                return false;
            }
        });*/
        
        /*Student.sort(students, (s1, s2) -> {

            if (s1.age < s2.age) {
                
                return true;
            } else {
            
                return false;
            }
        });*/
        
        /*Student.sort(students, (s1, s2) -> {

            if (s1.averageScore < s2.averageScore) {
                
                return true;
            } else {
            
                return false;
            }
        });*/
        
        Student.sort(students, (s1, s2) -> {

            if (s1.name.compareTo(s2.name) < 0) {
                
                return true;
            } else {
            
                return false;
            }
        });
        
        for (Student student : students) {
            System.out.println(student);
        }
        
        /*int[] numbersArray = {10, 50, 1, -5, 0, 9, 7, 5, 1, 100, 2};
        
        for (int i : numbersArray) {
            System.out.println(i);
        }
        
        System.out.println();
        
        //bubbleSort(numbersArray, SortOrderEnum.Direct);
        bubbleSort(numbersArray, SortOrderEnum.Reverse);
        
        for (int i : numbersArray) {
            System.out.println(i);
        }*/
    }

    /*static void bubbleSort(int[] arr) {
        
        int n = arr.length;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j < (n - i); j++) {
                
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }*/
    
    /*static void bubbleSort(int[] arr, SortOrderEnum order) {
        
        int n = arr.length;
        int temp = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 1; j < (n - i); j++) {
                
                if (order == SortOrderEnum.Direct) {
                    
                    if (arr[j - 1] > arr[j]) {
                        //swap elements  
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                
                    if (arr[j - 1] < arr[j]) {
                        //swap elements  
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }*/
}
