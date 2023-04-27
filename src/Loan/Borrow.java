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
      public List<Loan> recordsOfBorrowings = new ArrayList<>();  
      public List<Book> availableBookList = new ArrayList<>(); 
      LoanUtility n=new LoanUtility();
     
    public Borrow() throws FileNotFoundException {
        this.availableBookList=listOfBooks();
    }

    
public void Borrow(Book book){
this.availableBookList.remove(book);
}

public void ReturnTheBook(Book book){
this.availableBookList.add(book);
}

public List<Book> GetAvailableBookList(){
return this.availableBookList;
}

public boolean borrowBook(ArrayList<student> studentList) throws FileNotFoundException {
   Scanner scan= new Scanner(System.in);
    List<Book> books = listOfBooks();
   // System.out.println(availableBookList);
  Book myBook=myBookFactory.searchingBookbyId(books);
  if (myBook==null){
      System.out.println("TRY AGAIN ! \n");
         return false;}

  student myStudent=factory.searchStudentById(studentList);
  if (myStudent==null){
      System.out.println("TRY AGAIN ! \n");
         return false;}
  String name=myBook.getID();
  
 boolean isFound = false;
    if (myBook!=null && myStudent!=null){
    for (int i = 0; i < availableBookList.size(); i++) {
            if (name.equalsIgnoreCase(availableBookList.get(i).getID())) { 
                   System.out.println("\nYOU HAVE BORROWED THE BOOK SUCCESFULLY \n");
                 isFound =true;
                      Loan borrow = new Loan(myBook, myStudent, new Date(), null);
                 
                  Borrow(availableBookList.get(i));
                 this.availableBookList.remove(availableBookList.get(i)); 
                 this.recordsOfBorrowings.add(borrow);}
            
    }
        if (!isFound) {
            System.out.println("THE BOOK HAS ALREADY BEEN BORROWED BY SOMEONE ELSE");
            System.out.println("\nIF YOU WISH TO GET IN THE QUEUE FOR THIS BOOK GO BACK TO MAIN AND PRESS 6\n");   
        }  
}
else{System.out.println("\nOPERATION FAILURE , TRY AGAIN\n");}
    return isFound;
}




public boolean ReturnBook(ArrayList<student> studentList) throws FileNotFoundException {

    List<Book> books = listOfBooks();
    //  System.out.println(availableBookList);
    Book myBook=myBookFactory.searchingBookbyId(books);
    
  if (myBook==null){
      System.out.println("TRY AGAIN ! \n");
         return false;}

  student myStudent=factory.searchStudentById(studentList);
  if (myStudent==null){
      System.out.println("TRY AGAIN ! \n");
         return false;}
 
  String name=myBook.getID();
boolean isReturned = false;
 boolean  valid=true;
    if (myBook!=null && myStudent!=null){
        
         for (int i = 0; i < availableBookList.size(); i++) {
                           if (name.equalsIgnoreCase(availableBookList.get(i).getID())) { 
                             System.out.println("\nQUEUE IS NOT NECESSERY.BOOK IS ALREADY AVAILABLE\n");
                             isReturned=false;
                            }}
                      if(valid){
                               System.out.println("\nYOU HAVE RETURNED THE BOOK SUCCESSFULY\n");
                  Loan returnTheBook = new Loan(myBook, myStudent, null, new Date());
                  ReturnTheBook(myBook);
                  this.recordsOfBorrowings.add(returnTheBook);
                  isReturned=true;
                      }
                      // System.out.println(availableBookList);
     }   
    return isReturned;}









}     
        
     

























 
        //     if (myBook!=null && myStudent!=null && (myBookFactory.searchingBookbyId(availableBookList)!=null)){
//          Loan borrow = new Loan(myBook, myStudent, new Date(), null);
//         this.recordsOfBorrowings.add(borrow);
//         this.availableBookList.remove(myBook);
//         System.out.println("tebrikler");
//    
//     }else if(myBook==null) {System.out.println("Kitap zaten odunc alınmıs");}
//     else if(myStudent==null){System.out.println("ogrenci bulunamadı");} 







