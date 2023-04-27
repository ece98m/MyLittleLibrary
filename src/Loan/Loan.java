/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loan;

import Library.Book;
import java.text.SimpleDateFormat;
import java.util.Date;
import student.student;

/**
 *
 * @author Burak
 */
public class Loan {
       private Book book;
    private student borrower;
    private Date issuedDate;
    private Date dateReturned;

    public Loan(Book book, student borrower, Date issuedDate, Date dateReturned) {
        this.book = book;
        this.borrower = borrower;
        this.issuedDate = issuedDate;
        this.dateReturned = dateReturned;
    }

    public Book getBook() {
        return book;
    }

    public student getBorrower() {
        return borrower;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    
      public String getFormattedIssuedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(issuedDate);
    }
      
    public Date getDateReturned() {
        return dateReturned;
    }

       public String getFormattedReturnedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(dateReturned);
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrower(student borrower) {
        this.borrower = borrower;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    
    
//    @Override
//    public String toString() {
//        return "Borrowings{" + "book=" + book + ", borrower=" + borrower + ", issuedDate=" + issuedDate + ", dateReturned=" + dateReturned + '}';
//    }
public String toString() {
    return "Loan{" +
            "book=" + book +
            ", borrower=" + borrower +
            ", issuedDate=" + issuedDate +
            ", dateReturned=" + dateReturned +
            '}';
}
    
    

}