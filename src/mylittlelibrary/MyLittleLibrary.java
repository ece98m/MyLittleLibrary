/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mylittlelibrary;


import Library.BookFactory;
import static Library.BookFactory.*;

import Loan.Borrow;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import student.student;
import student.studentFactory;


/**
 *
 * @author Burak
 */
public class MyLittleLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       // MyLibrary2 myLibrary = new MyLibrary2();
      
        System.out.println(listOfBooks());
       Borrow borrow=new Borrow();
        BookFactory myBookFactory=new BookFactory();
       studentFactory students=new studentFactory();
     ArrayList<student> StudentList=students.createStudentFile();
   
    
         int myInput; 
     boolean valid=true;

       Scanner myScanner=new Scanner(System.in);
        
                   System.out.println("                             LİBRARY MAİN MENU\n");
        System.out.println("**************************************************************************************\n");
        System.out.println("1-) >>> Search for a specific book by title and/or author name. <<< \n");    //done 
        System.out.println("2-) >>> List all books by title and/or author name alphabetical order <<<\n");
        System.out.println("3-) >>> Search for a specific student by name and/or ID. <<<\n");
        System.out.println("4-) >>> List all students by alphabetical name and/or ID order. <<<\n");
        System.out.println("5-) >>> Register that a student has borrowed a book.<<<");
        System.out.println("6-) >>> Add that reader to waiting list (queue). <<<\n");
        System.out.println("7-) >>> Register that a student has returned a book.<<<");
        System.out.println("8-) >>> Display to the user the next student waiting for specific book <<<\n");
        System.out.println("9-) >>> For a specific student, list the books that they have borrowed<<<");
        System.out.println("0-) >>> Go back to main menu <<<\n");
                  
      
       
      
    
      
           
//  MAIN MENU TERMS
       while(valid){ 
          try{
           System.out.println("Please enter a number: ");
       myInput=myScanner.nextInt();
       switch(myInput){
           case 1:
                   myBookFactory.searchingBook();
               break;
                case 2:
                      myBookFactory.AlphabeticalBookListbyTitle();
                   break;
                     case 3:
                   boolean valid2=false;
                    while(!valid2){  
          
          try{
                       System.out.println("press 1 to search by ID OR press 2 to search by Name");
                  int   myInput2=myScanner.nextInt();
              switch(myInput2){
           case 1:
                 System.out.println(StudentList);
                 students.searchStudentById(students.getStudentList());  
                 valid2=true;
               break;
                case 2:
            students.searchStudentByName(); 
            valid2=true;  
               break;
                  default:
                    System.out.println("Please enter only 1 or 2");
                    myScanner.nextInt();
                    break;
                    
                     }
          }  
             catch(Exception e){
             
             System.out.println("Please enter only numbers");
                 System.out.println(valid2);
              myScanner.nextLine();
              
             }
         }   break; 
                    
             
                case 4:
                    students.AlphabeticalStudentListbyName();
       
               break;
               
                  case 5:
               borrow.borrowBook(StudentList);
        
               break;
             
                case 6:
                  // borrow.deneme();
                   
               break;
                
                case 7:
                borrow.ReturnBook(StudentList);
                   
               break;
                  case 8:
                                
            
               
               break;
             
                case 9:
                    System.out.println(listOfBooks());  
                   
               break;
                case 10:
                     valid=false;
                     break;
          
                case 0:
                      System.out.println("                             LİBRARY MAİN MENU\n");
        System.out.println("**************************************************************************************\n");
        System.out.println("1-) >>> Search for a specific book by title and/or author name. <<< \n");
        System.out.println("2-) >>> List all books by title and/or author name alphabetical order <<<\n");
        System.out.println("3-) >>> Search for a specific student by name and/or ID. <<<\n");
        System.out.println("4-) >>> List all students by alphabetical name and/or ID order. <<<\n");
        System.out.println("5-) >>> Register that a student has borrowed a book.<<<");
        System.out.println("6-) >>> Add that reader to waiting list (queue). <<<\n");
        System.out.println("7-) >>> Register that a student has returned a book.<<<");
        System.out.println("8-) >>> Display to the user the next student waiting for specific book <<<\n");
        System.out.println("9-) >>> For a specific student, list the books that they have borrowed<<<");
        System.out.println("0-) >>> Go back to main menu <<<\n");
                  
               break;
                default:
                    System.out.println("Please enter a number between 0 and 10.");
                    
                break;
             }
       }
            
   
        catch(Exception e){
           System.out.println("Please enter a number between 0 and 10.");
          myScanner.nextLine();
          
       }
       
        
    }
    }  
}
