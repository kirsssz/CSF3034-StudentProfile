/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author admin
 */
public class StudentInformationSystem {

 
    public static void main(String[] args) {
        String studentName = "Muhd Syakir";
        String studentId = "S87630";
        
        double mark1 = 20;
        double mark2 = 30;
        double totalMark = mark1 + mark2;
        
       System.out.println("===Student Information System===");
       System.out.println("Student Name: "+studentName);
       System.out.println("Student ID: "+studentId);
       System.out.println("---------------------------------");
               
               
       System.out.println("mark1:   "+mark1);
       System.out.println("Mark2:   "+mark2);
       System.out.println("Total Mark:   "+ totalMark);
       
       if (totalMark>=90){
           System.out.println("Excellent!");
       } else if (totalMark>=70){
           System.out.println("Good");
       }else {
           System.out.println("Needs Improvement");
       }
       System.out.println("---------------------------------");
   
       
        
        
    }
}
