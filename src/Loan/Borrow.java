/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import Library.Book;
import Library.BookFactory;
import static Library.BookFactory.listOfBooks;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.Scanner;

import student.student;

import student.studentFactory;

/**
 *
 * @author Burak
 */
public class Borrow {
      studentFactory factory=new studentFactory();
      BookFactory myBookFactory= new BookFactory();
      List<Loan> recordsOfBorrowings = new ArrayList<>();  
      public List<Book> borrowedBookList = new ArrayList<>();  

    

  
      
                 
                 
 
 
public void borrowBook(ArrayList<student> studentList) throws FileNotFoundException {
   
    List<Book> books = listOfBooks();
  
    
  Book myBook=myBookFactory.searchingBookbyId(books);
  student myStudent=factory.searchStudentById(studentList);
    Loan borrow = new Loan(myBook, myStudent, new Date(), null);
                   this.recordsOfBorrowings.add(borrow);
                   borrowedBookList.add(myBook);
                
    System.out.println(borrow);
    System.out.println("!!!!!"+this.borrowedBookList);
}



}


//    public Borrow {
//       this.currentlyBorrowedBooks=
//}
 
         







