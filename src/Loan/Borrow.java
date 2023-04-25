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
      List<Book> borrowedBookList = new ArrayList<>();  

    public List<Book> getBorrowedBookList() {
        return borrowedBookList;
    }

    public void setRecordsOfBorrowings(List<Loan> recordsOfBorrowings) {
        this.recordsOfBorrowings = recordsOfBorrowings;
    }
         
      
                 
                 
 
 
public void borrowBook(ArrayList<student> studentList) throws FileNotFoundException {
   
    List<Book> books = listOfBooks();

    Scanner scan = new Scanner(System.in);
  Book myBook=myBookFactory.searchingBookbyId(books);
  student myStudent=factory.searchStudentById(studentList);
    Loan borrow = new Loan(myBook, myStudent, new Date(), null);
                   this.recordsOfBorrowings.add(borrow);
                   this.borrowedBookList.add(myBook);
                   System.out.println(myBook.getNameOfBook() );
    System.out.println(borrow);
}



}
//    public Borrow {
//       this.currentlyBorrowedBooks=
//}
 
         







