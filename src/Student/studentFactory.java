/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Burak
 */

    public class studentFactory {
     private ArrayList<student> studentList;
  private ArrayList<student> copOfStudentList;
    public studentFactory(){
        // this.studentList= new ArrayList();      }
    this.studentList= new ArrayList();
    this.copOfStudentList=studentList;
    }

    public ArrayList<student> getCopOfStudentList() {
        return copOfStudentList;
    }
   
public ArrayList<student> createStudentFile(){
    
   
        for (int i=0; i<10; i++){
        String[] name = generateName();  
        student newStudent=new student(name[0],name[1]);
        studentList.add(newStudent);
    }    
        //now we will write this student list into a text file
         String filename = "C:\\Users\\Burak\\Desktop\\myLibrary3\\bu.txt";
       
try {
            FileWriter writer = new FileWriter(filename);
            
            // Write each object in the ArrayList to the file
            for (Object element : studentList) {
                writer.write(element.toString() + "\n");
            }
            
            // Close the FileWriter
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
         return studentList;
     }
public ArrayList<student> getStudentList() {
//    if (studentList.size() == 0) {
//      
//          return  studentList = createStudentFile();
//        
//    }
    return new ArrayList<>(studentList);}



    public void setStudentList(ArrayList<student> studentList) {
        this.studentList = studentList;
    }

    protected static String[] generateName() {
		
		NameGenerator NG = new NameGenerator();
		
		String name = NG.getRandomName();
		
		return name.split(" ");
	}
    
    public void searchStudentByName(){
    
    System.out.println("Please enter the name of student you are looking for"); 
    
    Scanner scan=new Scanner(System.in);
    String studentName=scan.nextLine().toLowerCase();
       
     for (int i=0; i<studentList.size(); i++){
   
         if (studentName.equals(studentList.get(i).getStudentName().toLowerCase() )){
         
             System.out.println("Here is the student member you are looking for :" + studentList.get(i));
         break;}
         else if((studentList.size()-1==i )&& (!studentName.equals(studentList.get(i).getStudentName().toLowerCase()))){
             System.out.println("There is no member with this name that you registered in our library. ");}
}
}



public student searchStudentById(ArrayList<student> studentList ) {
    Scanner scan = new Scanner(System.in);
    boolean isFound = false;
    System.out.println("Please enter the ID of student you are looking for:"); 
    try {
        int studentId = scan.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentId == studentList.get(i).getID()) {
                System.out.println("Here is the student member you are looking for: " + studentList.get(i));
                return studentList.get(i);
                
            }
        }
        if (!isFound) {
            System.out.println("There is no member with this ID that you registered in our library.");
        }
    } catch (InputMismatchException e) {
        System.out.println("Error! Please enter only numbers.");
    }
    return null;
}


public void AlphabeticalStudentListbyName() throws FileNotFoundException {
    
    List<String> liste=new ArrayList<>();
    
    
        for (int i=0; i<studentList.size() ; i++){
            
            liste.add(studentList.get(i).getStudentName()+" "+studentList.get(i).getStudentSurname());
        }
        
for (int i = 0; i < liste.size() - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < liste.size(); j++) {
        if (liste.get(j).compareTo(liste.get(minIndex)) < 0) {
            minIndex = j;
        }
    }
    if (minIndex != i) {
        Collections.swap(liste, i, minIndex);
    }
}

for (String s : liste) {
    System.out.println(s);
}
    
}
}
