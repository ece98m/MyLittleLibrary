/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author Burak
 */
public class student {
    

    private String studentName;
    private String studentSurname;
    private int ID ;
   // private int adress;
    private static int lastStudentID=0;
    private int studentID;
    
    public student(String studentName, String studentSurname) {
        lastStudentID++;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentID=lastStudentID;
     
    }

      public int getID() {
        return this.studentID;
    }
 
   public String toString() {
		
		return  "\n*********\nstudent ID:" + this.studentID+"\nName of student:" + this.studentName+ " " +this.studentSurname.toString();
	}
 
    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
    
 

    
 
}